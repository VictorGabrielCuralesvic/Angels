package com.system.angels.repository;

import com.system.angels.domain.Gestante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface GestanteRepository extends JpaRepository<Gestante, Long> {
    Optional<Gestante> findGestanteByCpf(String cpf);
}
