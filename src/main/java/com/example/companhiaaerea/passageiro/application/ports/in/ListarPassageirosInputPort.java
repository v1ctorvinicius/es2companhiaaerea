package com.example.companhiaaerea.passageiro.application.ports.in;

import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;

import java.util.List;

public interface ListarPassageirosInputPort {
    List<Passageiro> execute();
}
