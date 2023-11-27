package com.example.companhiaaerea.passageiro.application.ports.out;

import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;

public interface CadastrarPassageiroOutputPort {

    PassageiroEntity execute(PassageiroEntity passageiro);
}
