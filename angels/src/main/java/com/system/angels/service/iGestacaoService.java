package com.system.angels.service;

import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import java.util.List;

public interface iGestacaoService {

    public Gestacao adicionarGestacao(GestacaoCadastroDTO gestacaoDTO);
    
    public Gestacao obterGestacaoPorId(Long id);

    public Gestacao obterGestacaoPorGestante(Long gestante_id);
    
    public boolean gestacaoExiste(Long id);
    
    public List<Gestacao> obterTodasGestacoes();
    
    public Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO);
    
    public void deletarGestacao(Long id);

}
