package com.example.companhiaaerea.application.core.usecases;

import com.example.companhiaaerea.application.core.domain.Reserva;
import com.example.companhiaaerea.application.ports.in.ListarReservasInputPort;
import com.example.companhiaaerea.application.ports.out.ListarReservasOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ListarReservasUC implements ListarReservasInputPort {

    private final ListarReservasOutputPort listarReservasOutputPort;

    @Override
    public List<Reserva> execute() {
        return listarReservasOutputPort.execute();
    }
}
