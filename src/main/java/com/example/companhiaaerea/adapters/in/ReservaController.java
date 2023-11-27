package com.example.companhiaaerea.adapters.in;

import com.example.companhiaaerea.application.core.domain.Reserva;
import com.example.companhiaaerea.application.ports.in.ListarReservasInputPort;
import com.example.companhiaaerea.application.ports.in.ReservarVooInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reserva")
public class ReservaController {
    private final ReservarVooInputPort fazerReservaInputPort;
    private final ListarReservasInputPort listarReservasInputPort;

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReservas() {
        return ResponseEntity.ok(listarReservasInputPort.execute());

    }

    @PostMapping
    public ResponseEntity<Reserva> fazerReserva(Reserva reserva) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fazerReservaInputPort.execute(reserva));
    }
}
