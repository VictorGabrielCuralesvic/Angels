package com.system.angels.service.impl;

import com.system.angels.domain.Exame;
import com.system.angels.repository.ExameRepository;
import com.system.angels.service.iExameService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ExameService implements iExameService {

    private final ExameRepository exameRepository;

    public ExameService(ExameRepository exameRepository) {
        this.exameRepository = exameRepository;
    }

    public Exame criarExame(Exame exame) {
        return exameRepository.save(exame);
    }

    //public AtualizarExameDTO atualizarExame(AtualizarExameDTO atualizarExameDTO) {
    //    Optional<Exame> optionalExame = exameRepository.findById(atualizarExameDTO.getId());
    //    if (optionalExame.isPresent()) {
    //        Exame exame = optionalExame.get();
            // campos para atualizar aqui
    //        exame.setTipo(atualizarExameDTO.getTipo());
    //        exame.setResultado(atualizarExameDTO.getResultado());
    //        exame.setObservacao(atualizarExameDTO.getObservacao());
    //        exameRepository.save(exame);
            // --
    //        return atualizarExameDTO;
    //    } else {
    //        throw new RuntimeException("Exame não encontrado");
    //    }
    //}

    @Override
    public List<Exame> obterTodosExames() {
        return exameRepository.findAll();
    }

    @Override
    public Exame buscarExamePorId(Long id) {
        Optional<Exame> exame = exameRepository.findById(id);

        if (exame.isPresent()) {
            return exame.get();
        } else {
            throw new RuntimeException("Exame não encontrado");
        }
    }

    public void deleteExame(Long id) {
        exameRepository.deleteById(id);
    }
}
