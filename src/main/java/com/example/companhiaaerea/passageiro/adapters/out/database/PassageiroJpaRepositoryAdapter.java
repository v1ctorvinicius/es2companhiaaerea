package com.example.companhiaaerea.passageiro.adapters.out.database;

import com.example.companhiaaerea.passageiro.adapters.out.database.entities.PassageiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassageiroJpaRepositoryAdapter extends JpaRepository<PassageiroEntity, Long> {
}
