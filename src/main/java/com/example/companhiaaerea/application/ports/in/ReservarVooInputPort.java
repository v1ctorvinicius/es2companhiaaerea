package com.example.companhiaaerea.application.ports.in;

import com.example.companhiaaerea.reserva.application.core.domain.Reserva;

public interface ReservarVooInputPort {
    Reserva execute(Reserva reserva);
}
