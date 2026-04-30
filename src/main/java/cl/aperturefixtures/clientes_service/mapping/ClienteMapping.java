package cl.aperturefixtures.clientes_service.mapping;


import cl.aperturefixtures.clientes_service.dto.ResponseClienteDTO;
import cl.aperturefixtures.clientes_service.dto.RequestClienteDTO;
import cl.aperturefixtures.clientes_service.entity.Cliente;

import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class ClienteMapping {

    public static @NonNull ResponseClienteDTO toResponseDTO(@NonNull Cliente entity) {
        ResponseClienteDTO dto = new ResponseClienteDTO();
        dto.setIdCliente(entity.getIdCliente());
        dto.setNombreCliente(entity.getNombreCliente());
        dto.setCorreoCliente(entity.getCorreoCliente());
        return dto;
    }

    public static List<ResponseClienteDTO> allResponseDTO (List<Cliente> clientes) {
        List<ResponseClienteDTO> dtos = new ArrayList<>();
        for (Cliente cliente : clientes) {
            dtos.add(toResponseDTO(cliente));
        }
        return dtos;
    }

    public static @NonNull Cliente toEntity(@NonNull RequestClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNombreCliente(dto.getNombreCliente());
        cliente.setCorreoCliente(dto.getEmailCliente());
        cliente.setPasswordCliente(dto.getPasswordCliente());
        return cliente;
    }

}
