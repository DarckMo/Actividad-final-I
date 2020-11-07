package Clientes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Clientes.modelo.Cliente;
import Clientes.servicio.ClientService;
import Clientes.utilitario.ResponseDTO;

@RestController
@RequestMapping("/Clientes")
public class ClientController {

	@Autowired
	ClientService servicio;
	
	@GetMapping
	public ResponseDTO listar()  {
		return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar (@RequestBody Cliente Clientes) {
	return servicio.crear(Clientes);
	
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Cliente Clientes) {
		return servicio.Actualizar(Clientes);
		
	}
	
	@DeleteMapping("/(id)")
	public ResponseDTO eliminar(@PathVariable Long id) {
		return servicio.borrar(id);
	}
}
