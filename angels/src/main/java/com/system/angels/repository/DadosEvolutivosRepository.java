package com.system.angels.repository;

import com.system.angels.domain.DadosEvolutivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DadosEvolutivosRepository extends JpaRepository<DadosEvolutivos, Long> {
    ArrayList<DadosEvolutivos> findDadosEvolutivosByGestante_id(Long id);
}
