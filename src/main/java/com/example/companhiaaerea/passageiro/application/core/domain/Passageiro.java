package com.example.companhiaaerea.passageiro.application.core.domain;

import com.example.companhiaaerea.pessoa.application.core.domain.Pessoa;
import com.example.companhiaaerea.passageiro.adapters.out.database.entities.PassageiroEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class Passageiro extends Pessoa {
    private Long id;
    private LocalDate dataNascimento;
    private String telefone1;
    private String telefone2;

    public Passageiro(String cpf, String nome, String sexo, Long id, LocalDate dataNascimento, String telefone1, String telefone2) {
        super(cpf, nome, sexo);
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }

    public static Passageiro from(PassageiroEntity passageiroEntity) {
        return new Passageiro(
                passageiroEntity.getCpf(),
                passageiroEntity.getNome(),
                passageiroEntity.getSexo(),
                passageiroEntity.getId(),
                passageiroEntity.getDataNascimento(),
                passageiroEntity.getTelefone1(),
                passageiroEntity.getTelefone2()
        );
    }


    //    public static Passageiro from(PassageiroEntity passageiroEntity) {
//        return new Passageiro(
//                passageiroEntity.getDataNascimento(),
//                passageiroEntity.getTelefone1(),
//                passageiroEntity.getTelefone2()
//        );
//    }
}


