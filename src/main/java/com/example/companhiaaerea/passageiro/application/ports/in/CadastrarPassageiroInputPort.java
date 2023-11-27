package com.example.companhiaaerea.passageiro.application.ports.in;

import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;

public interface CadastrarPassageiroInputPort {
    Passageiro execute(Passageiro passageiro);
}
