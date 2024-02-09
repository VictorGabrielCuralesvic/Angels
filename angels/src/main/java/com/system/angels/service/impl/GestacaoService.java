package com.system.angels.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.angels.repository.GestacaoRepository;
import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.iGestacaoService;

@Service
public class GestacaoService implements iGestacaoService {

    @Autowired
    GestacaoRepository gestacaoRepository;

    @Override
    public Gestacao adicionarGestacao(GestacaoCadastroDTO gestacaoDTO) {
        return null;
    }

    @Override
    public Gestacao obterGestacaoPorId(Long id) {
        return null;
    }

    @Override
    public Gestacao obterGestacaoPorGestante(Long gestante_id) {
        return null;
    }

    @Override
    public boolean gestacaoExiste(Long id) {
        return gestacaoRepository.existsById(id);
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return gestacaoRepository.findAll();
    }

    @Override
    public Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO) {
        return gestacaoRepository.save(gestacaoDTO);
    }

    @Override
    public void deletarGestacao(Long id) {
        if (id != null) {
            gestacaoRepository.deleteById(id);
        } else {
            // caso nulo
        }
    }
}