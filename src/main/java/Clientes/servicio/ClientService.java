package Clientes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Clientes.modelo.Cliente;
import Clientes.repositorio.ClientRepository;
import Clientes.utilitario.Messages;
import Clientes.utilitario.ResponseDTO;

@Service
public class ClientService {

	@Autowired
	ClientRepository repositoriobd;
	
	
	public ResponseDTO findAll() {
	
		ResponseDTO res = new ResponseDTO();
		try {
			
			res.setRespuesta(repositoriobd.findAll());
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
		}
		
		return res;
	
	}
	
	
	public ResponseDTO crear(Cliente Clientes) {
		
		ResponseDTO res = new ResponseDTO();
		try {
			
			res.setRespuesta(repositoriobd.save(Clientes));
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
		}
		
		return res;
	}
	
	
	public ResponseDTO Actualizar(Cliente Clientes) {
		
		ResponseDTO res = new ResponseDTO();
		
		 try {
			 if(repositoriobd.existsById(Clientes.getIdclient())) {	
				res.setRespuesta(repositoriobd.save(Clientes));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
			 
			 }else {
				 res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				 res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);	
			 }
		 }catch(Exception e) {
			 
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		 }
		 
		 return res;
	}
	
	
	public ResponseDTO borrar(Long id) {
		ResponseDTO res = new ResponseDTO();
		
		try {
			if(repositoriobd.findById(id)!=null) {
				repositoriobd.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCESS);
				res.setMensaje(Messages.MSG_DELETE_OK);
			}else {
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
			
			
		}catch(Exception e) {
		
		res.setCodigo(Messages.CODE_FATAL_ERROR);
		res.setMensaje(Messages.MSG_FATAL_ERROR);
		e.printStackTrace();
	}
	return res;
	}
}
