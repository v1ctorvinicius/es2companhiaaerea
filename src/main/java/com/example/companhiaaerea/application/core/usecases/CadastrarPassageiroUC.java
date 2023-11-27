package com.example.companhiaaerea.application.core.usecases;

import com.example.companhiaaerea.application.core.domain.Passageiro;
import com.example.companhiaaerea.application.ports.in.CadastrarPassageiroInputPort;
import com.example.companhiaaerea.application.ports.out.CadastrarPassageiroOutputPort;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarPassageiroUC implements CadastrarPassageiroInputPort {

    private final CadastrarPassageiroOutputPort cadastrarPassageiroOutputPort;
    @Override
    public void execute(Passageiro passageiro) {
        cadastrarPassageiroOutputPort.execute(passageiro);
    }
}
