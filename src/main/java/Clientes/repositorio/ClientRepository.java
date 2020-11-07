package Clientes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Clientes.modelo.Cliente;


@Repository
public interface ClientRepository extends JpaRepository<Cliente , Long> {

	
	
	
}
