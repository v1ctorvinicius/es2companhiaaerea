package com.example.companhiaaerea.passageiro.application.core.usecases;

import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;
import com.example.companhiaaerea.passageiro.application.ports.in.CadastrarPassageiroInputPort;
import com.example.companhiaaerea.passageiro.application.ports.out.CadastrarPassageiroOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CadastrarPassageiroUC implements CadastrarPassageiroInputPort {

    private final CadastrarPassageiroOutputPort cadastrarPassageiroOutputPort;
    @Override
    public Passageiro execute(Passageiro passageiro) {
        return Passageiro.from( cadastrarPassageiroOutputPort.execute( PassageiroEntity.from(passageiro) ));
    }
}
