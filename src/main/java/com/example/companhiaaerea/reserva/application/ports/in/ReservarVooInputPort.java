package com.example.companhiaaerea.reserva.application.ports.in;

import com.example.companhiaaerea.reserva.application.core.domain.Reserva;

public interface ReservarVooInputPort {
    Reserva execute(Reserva reserva);
}
