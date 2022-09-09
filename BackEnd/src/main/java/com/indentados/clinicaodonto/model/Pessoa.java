package com.indentados.clinicaodonto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;
    @Column
    private String sobrenome;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column
    private String email;
    @Column(name = "data_de_cadastro")
    private Timestamp dataCadastro = Timestamp.valueOf(LocalDateTime.now());
}
