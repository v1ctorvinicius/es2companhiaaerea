package com.example.companhiaaerea.application.ports.out;

import com.example.companhiaaerea.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.application.core.domain.Passageiro;

public interface CadastrarPassageiroOutputPort {

    void execute(PassageiroEntity passageiro);
}
