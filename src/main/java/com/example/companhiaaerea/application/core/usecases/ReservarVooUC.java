package com.example.companhiaaerea.application.core.usecases;

import com.example.companhiaaerea.application.core.domain.Reserva;
import com.example.companhiaaerea.application.ports.in.ReservarVooInputPort;
import org.springframework.stereotype.Service;

@Service
public class ReservarVooUC implements ReservarVooInputPort {
    @Override
    public Reserva execute(Reserva reserva) {
        return null;
    }
}
