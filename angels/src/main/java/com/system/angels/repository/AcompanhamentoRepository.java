package com.system.angels.repository;

import com.system.angels.domain.Acompanhamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcompanhamentoRepository extends JpaRepository<Acompanhamento, Long> {

    public List<Acompanhamento> findByGestacaoId(Long gestacaoId);

}
