package com.example.companhiaaerea.adapters.out;

import com.example.companhiaaerea.application.core.domain.Passageiro;
import com.example.companhiaaerea.application.core.repository.PassageiroRepository;
import com.example.companhiaaerea.application.ports.out.CadastrarPassageiroOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastrarPassageiroOutputAdapter implements CadastrarPassageiroOutputPort {

    private final PassageiroRepository passageiroRepository;

    @Override
    public void execute(Passageiro passageiro) {
        passageiroRepository.save(passageiro);
    }
}
