package com.example.companhiaaerea.passageiro.application.core.domain;

import com.example.companhiaaerea.pessoa.application.core.domain.Pessoa;
import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

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


