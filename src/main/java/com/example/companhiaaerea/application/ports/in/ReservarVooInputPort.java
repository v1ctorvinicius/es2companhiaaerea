package com.example.companhiaaerea.application.ports.in;

import com.example.companhiaaerea.application.core.domain.Reserva;

public interface ReservarVooInputPort {
    Reserva execute(Reserva reserva);
}
