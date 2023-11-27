package com.example.companhiaaerea.passageiro.application.core.usecases;

import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;
import com.example.companhiaaerea.passageiro.application.ports.in.ListarPassageirosInputPort;
import com.example.companhiaaerea.passageiro.application.ports.out.ListarPassageirosOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@RequiredArgsConstructor
@Component
public class ListarPassageirosUC implements ListarPassageirosInputPort {
    private final ListarPassageirosOutputPort listarPassageirosOutputPort;

    @Override
    public List<Passageiro> execute(){
        var passageiros = listarPassageirosOutputPort.execute();
        return  listarPassageirosOutputPort.execute().stream().map(PassageiroEntity::toDomain).toList();
    }
}
