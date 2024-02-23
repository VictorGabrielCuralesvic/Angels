package com.system.angels.service;

import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;

import java.util.List;

public interface iGestacaoService {

    GestacaoCadastroDTO adicionarGestacao(GestacaoCadastroDTO gestacaoDTO);
    
    VisualizarGestacaoDTO obterGestacaoPorId(Long id);

    VisualizarGestacaoDTO obterGestacaoPorGestante(Long gestante_id);
    
    boolean gestacaoExiste(Long id);
    
    List<Gestacao> obterTodasGestacoes();
    
    AtualizarGestacaoDTO atualizarGestacao(Long id, AtualizarGestacaoDTO atualizarGestacaoDTO);
    
    void deletarGestacao(Long id);

}
