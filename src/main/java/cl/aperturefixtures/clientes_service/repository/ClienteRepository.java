package cl.aperturefixtures.clientes_service.repository;


import cl.aperturefixtures.clientes_service.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    boolean existsClienteByCorreoCliente(String correoCliente);

    Optional<Cliente> findClienteByCorreoCliente(String correoCliente);
}
