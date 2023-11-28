package com.example.companhiaaerea.reserva.application.ports.out;

import com.example.companhiaaerea.reserva.adapters.out.repositories.database.ReservaEntity;

import java.util.List;

public interface ListarReservasOutputPort {
    List<ReservaEntity> execute();
}
