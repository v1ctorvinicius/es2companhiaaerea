package com.example.companhiaaerea.passageiro.adapters.out;

import com.example.companhiaaerea.passageiro.adapters.out.repositories.PassageiroJpaRepositoryAdapter;
import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.passageiro.application.ports.out.CadastrarPassageiroOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastrarPassageiroOutputAdapter implements CadastrarPassageiroOutputPort {

    private final PassageiroJpaRepositoryAdapter passageiroRepository;

    public PassageiroEntity execute(PassageiroEntity passageiro) {
        return passageiroRepository.save(passageiro);
    }
}
