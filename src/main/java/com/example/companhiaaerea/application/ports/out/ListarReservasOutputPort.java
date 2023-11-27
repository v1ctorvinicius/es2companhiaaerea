package com.example.companhiaaerea.application.ports.out;

import com.example.companhiaaerea.application.core.domain.Reserva;

import java.util.List;

public interface ListarReservasOutputPort {
    List<Reserva> execute();
}
