package com.example.companhiaaerea.pessoa.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String sexo;

}

