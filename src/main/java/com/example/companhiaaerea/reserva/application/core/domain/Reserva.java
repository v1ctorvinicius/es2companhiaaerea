package com.example.companhiaaerea.reserva.application.core.domain;

import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;
import com.example.companhiaaerea.reserva.adapters.out.repositories.entities.ReservaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Reserva {
    private Integer assento;
    private Passageiro passageiro;

    public static Reserva from(ReservaEntity reservaEntity){
        return Reserva.builder()
                .assento(reservaEntity.getAssento())
                .passageiro(Passageiro.from(reservaEntity.getPassageiro()))
                .build();
    }
}

