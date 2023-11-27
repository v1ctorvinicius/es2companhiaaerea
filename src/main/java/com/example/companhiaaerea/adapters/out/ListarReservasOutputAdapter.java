package com.example.companhiaaerea.adapters.out;

import com.example.companhiaaerea.application.core.domain.Reserva;
import com.example.companhiaaerea.application.core.repository.ReservaRepository;
import com.example.companhiaaerea.application.ports.out.ListarReservasOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarReservasOutputAdapter implements ListarReservasOutputPort {

    private final ReservaRepository reservaRepository;

    @Override
    public List<Reserva> execute() {
        return reservaRepository.findAll();
    }
}
