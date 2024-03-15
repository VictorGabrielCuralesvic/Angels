package com.system.angels.service.impl;

import com.system.angels.domain.Gestante;
import com.system.angels.repository.GestanteRepository;
import com.system.angels.service.iGestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GestanteService implements iGestanteService {
    public final GestanteRepository repositorio;

    public List<Gestante> listarGestantes() {
        return repositorio.findAll();
    }

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

    public Gestante atualizarGestante(Long id, Gestante gestanteAtualizada) throws RuntimeException {
        Gestante gestante = buscarGestantePorId(id);
        gestante.setNome(gestanteAtualizada.getNome());
        gestante.setDataNascimento(gestanteAtualizada.getDataNascimento());
        gestante.setCpf(gestanteAtualizada.getCpf());
        gestante.setRaca(gestanteAtualizada.getRaca());
        gestante.setSexo(gestanteAtualizada.getSexo());
        return registrarGestante(gestante);
    }

    public void deletarGestante(Long id) {
        Gestante gestante = buscarGestantePorId(id);
        repositorio.delete(gestante);
    }
}
