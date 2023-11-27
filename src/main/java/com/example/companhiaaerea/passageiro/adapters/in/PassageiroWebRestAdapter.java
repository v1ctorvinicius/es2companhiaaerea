package com.example.companhiaaerea.passageiro.adapters.in;

import com.example.companhiaaerea.passageiro.application.core.domain.Passageiro;
import com.example.companhiaaerea.passageiro.application.ports.in.CadastrarPassageiroInputPort;
import com.example.companhiaaerea.passageiro.application.ports.in.ListarPassageirosInputPort;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passageiros")
@RequiredArgsConstructor
public class PassageiroWebRestAdapter {
    private final ListarPassageirosInputPort listarPassageirosInputPort;
    private final CadastrarPassageiroInputPort cadastrarPassageiroInputPort;

    @GetMapping
    public ResponseEntity<List<Passageiro>> listarPassageiros(){
        return ResponseEntity.ok(listarPassageirosInputPort.execute());
    }

    @PostMapping
    public ResponseEntity<Passageiro> cadastrarPassageiro(@RequestBody Passageiro passageiro){
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastrarPassageiroInputPort.execute(passageiro));
    }
}
