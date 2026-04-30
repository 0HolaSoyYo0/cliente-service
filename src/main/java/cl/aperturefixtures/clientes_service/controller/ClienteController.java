package cl.aperturefixtures.clientes_service.controller;


import cl.aperturefixtures.clientes_service.dto.ResponseClienteDTO;
import cl.aperturefixtures.clientes_service.service.ClienteService;
import cl.aperturefixtures.clientes_service.dto.RequestClienteDTO;
import cl.aperturefixtures.clientes_service.entity.Cliente;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;


@RequestMapping("/api/v1/clientes")
@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/ingreso")
    public ResponseEntity<RequestClienteDTO> save(@Valid @RequestBody RequestClienteDTO dto) {
        clienteService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @GetMapping("/vista")
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findAll());
    }

    @GetMapping("/vista/{correo}")
    public ResponseEntity<ResponseClienteDTO> findByCorreo(@Valid @PathVariable String correo) {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findByCorreo(correo));
    }

}
