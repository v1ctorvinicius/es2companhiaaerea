package com.example.companhiaaerea.application.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Voo {
    private Piloto piloto;
    private Integer numero;
    private LocalDateTime data;
}

