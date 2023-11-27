package com.example.companhiaaerea.passageiro.adapters.out.repositories.entities;

import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "passageiro")
public class PassageiroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataNascimento;
    private String telefone1;
    private String telefone2;

    public static PassageiroEntity from(Passageiro passageiro){
        return PassageiroEntity.builder()
                .dataNascimento(passageiro.getDataNascimento())
                .telefone1(passageiro.getTelefone1())
                .telefone2(passageiro.getTelefone2())
                .build();
    }


    public static Passageiro toDomain(PassageiroEntity passageiro){
        return Passageiro.builder()

                .dataNascimento(passageiro.getDataNascimento())
                .telefone1(passageiro.getTelefone1())
                .telefone2(passageiro.getTelefone2())
                .build();
    }
}
