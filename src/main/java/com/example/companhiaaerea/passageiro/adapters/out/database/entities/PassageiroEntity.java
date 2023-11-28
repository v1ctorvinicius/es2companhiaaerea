package com.example.companhiaaerea.passageiro.adapters.out.database.entities;

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
    private String cpf;
    private String nome;
    private String sexo;

    public static PassageiroEntity from(Passageiro passageiro){
        return PassageiroEntity.builder()
                .id(passageiro.getId())
                .dataNascimento(passageiro.getDataNascimento())
                .telefone1(passageiro.getTelefone1())
                .telefone2(passageiro.getTelefone2())
                .cpf(passageiro.getCpf())
                .nome(passageiro.getNome())
                .sexo(passageiro.getSexo())
                .build();
    }

}
