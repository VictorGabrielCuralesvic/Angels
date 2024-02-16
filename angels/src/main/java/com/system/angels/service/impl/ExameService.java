package com.system.angels.service.impl;

import com.system.angels.domain.Exame;
import com.system.angels.dto.AtualizarExameDTO;
import com.system.angels.dto.ExameDTO;
import com.system.angels.dto.RemoverExameDTO;
import com.system.angels.dto.VisualizarExameDTO;
import com.system.angels.repository.ExameRepository;
import com.system.angels.service.iExameService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ExameService implements iExameService {

    private final ExameRepository exameRepository;

    public ExameService(ExameRepository exameRepository) {
        this.exameRepository = exameRepository;
    }
    @Override
    public ExameDTO criarExame(ExameDTO exameDTO) {
        Exame exame = new Exame();
        exame.setTipo(exameDTO.getTipo());
        exame.setResultado(exameDTO.getResultado());
        exame.setObservacao(exameDTO.getObservacao());
        // associar exame ao acompanhamento
        exame = exameRepository.save(exame);
        ExameDTO createdExameDTO = new ExameDTO();
        createdExameDTO.setAcompanhamentoId(exame.getAcompanhamento());
        createdExameDTO.setTipo(exame.getTipo());
        createdExameDTO.setResultado(exame.getResultado());
        createdExameDTO.setObservacao(exame.getObservacao());
        return createdExameDTO;
    }

    @Override
    public VisualizarExameDTO visualizarExame(Long id) {
        Optional<Exame> optionalExame = exameRepository.findById(id);
        if (optionalExame.isPresent()) {
            Exame exame = optionalExame.get();
            VisualizarExameDTO visualizarExameDTO = new VisualizarExameDTO();
            visualizarExameDTO.setId(exame.getId());
            //visualizarExameDTO.setAcompanhamentoId(exame.getAcompanhamento().getId());
            visualizarExameDTO.setTipo(exame.getTipo());
            visualizarExameDTO.setResultado(exame.getResultado());
            visualizarExameDTO.setObservacao(exame.getObservacao());
            return visualizarExameDTO;
        } else {
            throw new RuntimeException(("Exame não encontrado"));
        }
    }

    @Override
    public AtualizarExameDTO atualizarExame(AtualizarExameDTO atualizarExameDTO) {
        Optional<Exame> optionalExame = exameRepository.findById(atualizarExameDTO.getId());
        if (optionalExame.isPresent()) {
            Exame exame = optionalExame.get();
            // campos para atualizar aqui
            exame.setTipo(atualizarExameDTO.getTipo());
            exame.setResultado(atualizarExameDTO.getResultado());
            exame.setObservacao(atualizarExameDTO.getObservacao());
            exameRepository.save(exame);
            return atualizarExameDTO;
        } else {
            throw new RuntimeException("Exame não encontrado");
        }
    }

    @Override
    public void removerExame(RemoverExameDTO removerExameDTO) {
        exameRepository.deleteById(removerExameDTO.getId());
    }
}
