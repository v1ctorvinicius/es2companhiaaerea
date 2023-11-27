package com.example.companhiaaerea.application.ports.out;

import com.example.companhiaaerea.application.core.domain.Passageiro;

public interface CadastrarPassageiroOutputPort {

    void execute(Passageiro passageiro);
}
