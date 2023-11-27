package com.example.companhiaaerea.adapters.out.repositories;

import com.example.companhiaaerea.application.core.domain.Passageiro;
import com.example.companhiaaerea.application.core.repository.PassageiroRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PassageiroRepositoryAdapter implements PassageiroRepository {

    @Override
    public Passageiro save(Passageiro passageiro) {
        return null;
    }
}
