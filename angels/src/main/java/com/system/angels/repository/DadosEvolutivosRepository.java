package com.system.angels.repository;

import com.system.angels.domain.DadosEvolutivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosEvolutivosRepository extends JpaRepository<DadosEvolutivos, Long> {
}
