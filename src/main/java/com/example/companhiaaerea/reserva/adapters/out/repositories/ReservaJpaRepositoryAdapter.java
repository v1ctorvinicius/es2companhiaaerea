package com.example.companhiaaerea.reserva.adapters.out.repositories;


import com.example.companhiaaerea.reserva.adapters.out.repositories.database.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaJpaRepositoryAdapter extends JpaRepository<ReservaEntity, Long> {

}
