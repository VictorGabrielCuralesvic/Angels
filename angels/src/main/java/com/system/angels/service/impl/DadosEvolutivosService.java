package com.system.angels.service.impl;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.repository.DadosEvolutivosRepository;
import com.system.angels.service.iDadosEvolutivosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DadosEvolutivosService implements iDadosEvolutivosService {

    private final DadosEvolutivosRepository repositorio;

    public List<DadosEvolutivos> listarDadosEvolutivos() {
        return repositorio.findAll();
    }
}
