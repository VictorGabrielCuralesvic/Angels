package com.system.angels.service.impl;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.repository.DadosEvolutivosRepository;
import com.system.angels.service.iDadosEvolutivosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DadosEvolutivosService implements iDadosEvolutivosService {

    private final DadosEvolutivosRepository repositorio;

    public List<DadosEvolutivos> listarDadosEvolutivos() {
        return repositorio.findAll();
    }

    public DadosEvolutivos buscarDadosEvolutivosPorId(Long id) {
        Optional<DadosEvolutivos> dadosEvolutivos = repositorio.findById(id);

        if (dadosEvolutivos.isEmpty()) {
            throw new RuntimeException("Não foram encontrados dados evolutivos associados a esse ID.");
        }

        return dadosEvolutivos.get();
    }

    public DadosEvolutivos registrarDadosEvolutivos(DadosEvolutivos dadosEvolutivos) {
        return repositorio.save(dadosEvolutivos);
    }

}
