package com.system.angels.service;

import com.system.angels.domain.Gestacao;

import java.util.List;

public interface iGestacaoService {
    
    Gestacao obterGestacaoPorId(Long id);

    //Gestacao obterGestacaoPorGestante(Long gestante_id);
    
    boolean gestacaoExiste(Long id);
    
    List<Gestacao> obterTodasGestacoes();

}
