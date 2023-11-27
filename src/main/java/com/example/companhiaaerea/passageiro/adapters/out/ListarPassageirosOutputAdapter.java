package com.example.companhiaaerea.passageiro.adapters.out;


import com.example.companhiaaerea.passageiro.adapters.out.repositories.PassageiroJpaRepositoryAdapter;
import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.passageiro.application.ports.out.ListarPassageirosOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarPassageirosOutputAdapter implements ListarPassageirosOutputPort {
    private final PassageiroJpaRepositoryAdapter passageiroRepository;

    @Override
    public List<PassageiroEntity> execute() {
        return passageiroRepository.findAll();
    }
}
