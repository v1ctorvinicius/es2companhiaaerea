package com.example.companhiaaerea.adapters.out;

import com.example.companhiaaerea.adapters.out.repositories.PassageiroJpaRepositoryAdapter;
import com.example.companhiaaerea.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.application.ports.out.CadastrarPassageiroOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastrarPassageiroOutputAdapter implements CadastrarPassageiroOutputPort {

    private final PassageiroJpaRepositoryAdapter passageiroRepository;

    public void execute(PassageiroEntity passageiro) {
        passageiroRepository.save(passageiro);
    }
}
