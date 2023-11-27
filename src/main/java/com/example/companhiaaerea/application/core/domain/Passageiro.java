package com.example.companhiaaerea.application.core.domain;

import com.example.companhiaaerea.adapters.out.repositories.entities.PassageiroEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Passageiro extends Pessoa {
    private LocalDate dataNascimento;
    private String telefone1;
    private String telefone2;

    public static Passageiro from(PassageiroEntity passageiroEntity){
        return new Passageiro(
            passageiroEntity.getDataNascimento(),
            passageiroEntity.getTelefone1(),
            passageiroEntity.getTelefone2()
        );
    }
}


