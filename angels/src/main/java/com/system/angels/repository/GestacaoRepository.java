package com.system.angels.repository;

import com.system.angels.domain.Gestacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
interface GestacaoRepository extends JpaRepository<Gestacao, Long> {

}
