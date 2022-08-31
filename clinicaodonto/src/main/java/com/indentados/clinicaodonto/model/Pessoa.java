package com.indentados.clinicaodonto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    public Integer id;
    public String nome;
    public String sobreNome;
    public Endereco endereco;
    public String email;
    public Timestamp dataCadastro;
}
