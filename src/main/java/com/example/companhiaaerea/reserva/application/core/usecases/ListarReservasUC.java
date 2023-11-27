package com.example.companhiaaerea.reserva.application.core.usecases;

import com.example.companhiaaerea.reserva.application.core.domain.Reserva;
import com.example.companhiaaerea.reserva.application.ports.in.ListarReservasInputPort;
import com.example.companhiaaerea.reserva.application.ports.out.ListarReservasOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ListarReservasUC implements ListarReservasInputPort {

    private final ListarReservasOutputPort listarReservasOutputPort;

    @Override
    public List<Reserva> execute() {
        var reservas = listarReservasOutputPort.execute();
        return reservas.stream().map(Reserva::from).toList();
    }
}
