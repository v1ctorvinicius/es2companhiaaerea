package com.example.companhiaaerea.passageiro.adapters.out.repositories;

import com.example.companhiaaerea.passageiro.adapters.out.repositories.entities.PassageiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassageiroJpaRepositoryAdapter extends JpaRepository<PassageiroEntity, Long> {

}
