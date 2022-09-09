package com.indentados.clinicaodonto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //possível redundancia com os requisitos, uma vez que os requisitos pedem só nome de usuário e não email.
    //o id seria o id seria a pk enviada para a Pessoa?
    //Usuario seria o email e o nome em display no fronte seria nome + sobrenome
    public Long id;
    public String nomeDeUsuario;
    public String senha;
    public Long idDentista;
}
