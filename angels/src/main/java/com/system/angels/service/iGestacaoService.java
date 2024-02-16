package com.system.angels.service;

import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import java.util.List;

public interface iGestacaoService {

    Gestacao adicionarGestacao(GestacaoCadastroDTO gestacaoDTO);
    
    Gestacao obterGestacaoPorId(Long id);

    Gestacao obterGestacaoPorGestante(Long gestante_id);
    
    boolean gestacaoExiste(Long id);
    
    List<Gestacao> obterTodasGestacoes();
    
    Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO);
    
    void deletarGestacao(Long id);

}
