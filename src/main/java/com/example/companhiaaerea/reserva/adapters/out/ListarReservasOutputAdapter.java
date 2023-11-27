package com.example.companhiaaerea.reserva.adapters.out;

import com.example.companhiaaerea.reserva.adapters.out.repositories.ReservaJpaRepositoryAdapter;
import com.example.companhiaaerea.reserva.adapters.out.repositories.entities.ReservaEntity;
import com.example.companhiaaerea.reserva.application.ports.out.ListarReservasOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarReservasOutputAdapter implements ListarReservasOutputPort {

    private final ReservaJpaRepositoryAdapter reservaRepository;

    @Override
    public List<ReservaEntity> execute() {
        return reservaRepository.findAll();
    }
}
