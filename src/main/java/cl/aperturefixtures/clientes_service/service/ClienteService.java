package cl.aperturefixtures.clientes_service.service;


import cl.aperturefixtures.clientes_service.exception.ClienteYaExisteException;
import cl.aperturefixtures.clientes_service.repository.ClienteRepository;
import cl.aperturefixtures.clientes_service.mapping.ClienteMapping;
import cl.aperturefixtures.clientes_service.dto.RequestClienteDTO;
import cl.aperturefixtures.clientes_service.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.jspecify.annotations.NonNull;

import java.util.List;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void save(@NonNull RequestClienteDTO dto) {
        if (clienteRepository.existsClienteByCorreoCliente(dto.getEmailCliente())) {
            throw new ClienteYaExisteException("Ya existe un cliente con ese correo.");
        }
        clienteRepository.save(ClienteMapping.toEntity(dto));
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

}
