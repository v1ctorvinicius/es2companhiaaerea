package com.example.companhiaaerea.piloto.application.core.domain;

import com.example.companhiaaerea.application.core.domain.Pessoa;
import lombok.Data;

@Data
public class Piloto extends Pessoa {
    private String numeroLicenca;
}
