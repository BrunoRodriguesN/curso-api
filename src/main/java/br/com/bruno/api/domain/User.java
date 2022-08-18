package br.com.bruno.api.domain;


import lombok.*;

import javax.persistence.*;

@Data // Cria os getters,setters, equalhashcode , toString
@AllArgsConstructor // cria o construtor com os parametros
@NoArgsConstructor // cria o cronstrutor sem os parametros
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true) // Significa que o email deve ser unico
    private String email;
    private String password;



}
