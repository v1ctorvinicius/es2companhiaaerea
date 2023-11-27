package com.example.companhiaaerea.reserva.application.ports.in;

import com.example.companhiaaerea.reserva.application.core.domain.Reserva;

import java.util.List;

public interface ListarReservasInputPort {
    List<Reserva> execute();
}
