package cl.aperturefixtures.clientes_service.dto;


import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseClienteDTO {

    private Long idCliente;
    private String nombreCliente;
    private String correoCliente;
}
