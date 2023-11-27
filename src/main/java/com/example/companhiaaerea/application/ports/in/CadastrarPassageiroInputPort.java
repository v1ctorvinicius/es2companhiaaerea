package com.example.companhiaaerea.application.ports.in;

import com.example.companhiaaerea.application.core.domain.Passageiro;

public interface CadastrarPassageiroInputPort {
    void execute(Passageiro passageiro);
}
