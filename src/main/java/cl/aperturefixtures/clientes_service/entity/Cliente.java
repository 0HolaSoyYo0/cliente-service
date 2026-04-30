package cl.aperturefixtures.clientes_service.entity;


import jakarta.persistence.*;

import lombok.*;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes", schema = "clientes_test")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(length = 50, nullable = false)
    private String nombreCliente;

    @Column(length = 100, nullable = false, unique = true)
    private String correoCliente;

    @Column(length = 15, nullable = false, unique = true)
    private String passwordCliente;

}
