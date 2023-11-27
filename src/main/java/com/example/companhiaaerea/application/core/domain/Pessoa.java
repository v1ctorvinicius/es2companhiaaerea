package com.example.companhiaaerea.application.core.domain;

import lombok.Data;

@Data
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String sexo;
}

