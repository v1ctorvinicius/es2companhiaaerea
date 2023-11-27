package com.example.companhiaaerea.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Passageiro extends Pessoa {
    private LocalDate dataNascimento;
    private String[] telefones;
}
