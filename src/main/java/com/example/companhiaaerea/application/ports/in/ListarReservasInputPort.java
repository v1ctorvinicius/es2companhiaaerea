package com.example.companhiaaerea.application.ports.in;

import com.example.companhiaaerea.application.core.domain.Reserva;

import java.util.List;

public interface ListarReservasInputPort {
    List<Reserva> execute();
}
