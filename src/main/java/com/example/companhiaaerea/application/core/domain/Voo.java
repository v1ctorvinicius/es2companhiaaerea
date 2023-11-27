package com.example.companhiaaerea.application.core.domain;

import com.example.companhiaaerea.piloto.application.core.domain.Piloto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Voo {
    private Piloto piloto;
    private Integer numero;
    private LocalDateTime data;
}

