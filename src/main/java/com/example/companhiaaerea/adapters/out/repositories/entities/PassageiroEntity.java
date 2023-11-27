package com.example.companhiaaerea.adapters.out.repositories.entities;

import com.example.companhiaaerea.application.core.domain.Passageiro;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "passageiro")
public class PassageiroEntity {
    @Id
    private Long id;
    private LocalDate dataNascimento;
    private String telefone1;
    private String telefone2;

    public static PassageiroEntity from(Passageiro passageiro){
        return PassageiroEntity.builder()
                .id(null)
                .dataNascimento(passageiro.getDataNascimento())
                .telefone1(passageiro.getTelefone1())
                .telefone2(passageiro.getTelefone2())
                .build();
    }


}
