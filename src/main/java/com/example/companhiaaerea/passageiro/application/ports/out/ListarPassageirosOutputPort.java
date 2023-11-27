package com.example.companhiaaerea.passageiro.application.ports.out;


import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;

import java.util.List;

public interface ListarPassageirosOutputPort {
    List<PassageiroEntity> execute();
}
