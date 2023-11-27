package com.example.companhiaaerea.reserva.adapters.out.repositories.entities;


import com.example.companhiaaerea.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.reserva.application.core.domain.Reserva;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Reserva")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReservaEntity {

    @Id
    private Long id;
    private Integer assento;

    @ManyToOne
    private PassageiroEntity passageiro;

    public static ReservaEntity from(Reserva reserva){
        return ReservaEntity.builder()
                .id(null)
                .assento(reserva.getAssento())
                .passageiro(PassageiroEntity.from(reserva.getPassageiro()))
                .build();
    }

}
