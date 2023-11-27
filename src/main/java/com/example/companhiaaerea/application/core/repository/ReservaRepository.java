package com.example.companhiaaerea.application.core.repository;

import com.example.companhiaaerea.application.core.domain.Reserva;

import java.util.List;

public interface ReservaRepository {
    List<Reserva> findAll();
}
