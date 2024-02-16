package com.system.angels.service.impl;

import java.util.List;
import java.util.Optional;

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
        //TODO
        return null;
    }

    @Override
    public Gestacao obterGestacaoPorId(Long id) {
        Optional<Gestacao> gestacao = gestacaoRepository.findById(id);

        if(gestacao.isEmpty()) {
            throw new RuntimeException("Não existe uma gestacão associada ao id.");
        }
        return gestacao.get();
    }

    @Override
    public Gestacao obterGestacaoPorGestante(Long gestante_id) {
        Optional<Gestacao> gestacao = gestacaoRepository.findById(gestante_id);
        if (gestacao.isEmpty()) {
            throw new RuntimeException("Não existe uma gestação associada a essa gestante.");
        }
        return gestacao.get();
    }

    @Override
    public boolean gestacaoExiste(Long id) {
        if (id != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return gestacaoRepository.findAll();
    }

    @Override
public Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO) {
    return null;
    //TODO
}


    @Override
    public void deletarGestacao(Long id) {
      Gestacao gestacao = obterGestacaoPorId(id);
      gestacaoRepository.delete(gestacao);
    }

}