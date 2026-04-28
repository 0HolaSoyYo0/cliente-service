package cl.aperturefixtures.clientes_service.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import lombok.*;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestClienteDTO {

    @Size(min = 1, max = 50)
    @NotBlank
    private String nombreCliente;

    @Size(min = 1, max = 100)
    @NotBlank
    @Email
    private String emailCliente;

    @Size(min = 6, max = 15)
    @NotBlank
    private String passwordCliente;

}
