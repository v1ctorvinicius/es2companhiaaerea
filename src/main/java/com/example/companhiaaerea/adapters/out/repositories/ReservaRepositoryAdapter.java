package com.example.companhiaaerea.adapters.out.repositories;


import com.example.companhiaaerea.application.core.domain.Passageiro;
import com.example.companhiaaerea.application.core.domain.Reserva;
import com.example.companhiaaerea.application.core.repository.ReservaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class ReservaRepositoryAdapter implements ReservaRepository {


    @Override
    public List<Reserva> findAll() {
        return findAllMock();
    }

    private List<Reserva> findAllMock(){
        Passageiro passageiro = new Passageiro(LocalDate.of(1972, 1, 1), new String[]{"(98) 999999-9999", "(98) 999999-1234"});
        Passageiro passageiro2 = new Passageiro(LocalDate.of(1999, 3, 13), new String[]{"(98) 999999-1111", "(98) 999999-4321"});
        return List.of(new Reserva(1, passageiro), new Reserva(2, passageiro2));
    }
}
