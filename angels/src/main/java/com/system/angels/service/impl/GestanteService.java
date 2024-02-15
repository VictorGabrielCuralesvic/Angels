package com.system.angels.service.impl;

import com.system.angels.domain.Gestante;
import com.system.angels.repository.GestanteRepository;
import com.system.angels.service.iGestacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GestanteService implements iGestacaoService {
    public final GestanteRepository repositorio;

    public Gestante buscarGestantePorId(Long id) throws RuntimeException {
        Optional<Gestante> gestante = repositorio.findById(id);

        if (gestante.isEmpty()) {
            throw new RuntimeException("Não existe uma gestante associada a esse id.");
        }

        return gestante.get();
    }

    public Gestante buscarGestantePorCpf(String cpf) throws RuntimeException {
        Optional<Gestante> gestante = repositorio.findGestanteByCpf(cpf);

        if (gestante.isEmpty()) {
            throw new RuntimeException("Não existe uma gestante associada a esse cpf.");
        }

        return gestante.get();
    }

    public Gestante registrarGestante(Gestante gestante) {
        return repositorio.save(gestante);
    }

    public void deletarGestante(String cpf) {
        Gestante gestante = buscarGestantePorCpf(cpf);
        repositorio.delete(gestante);
    }
}
