package com.example.companhiaaerea.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reserva {
    private Integer assento;
    private Passageiro passageiro;
}

