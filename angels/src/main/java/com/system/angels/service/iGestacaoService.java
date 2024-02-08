package com.system.angels.service;

import com.system.angels.domain.Gestante;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import java.util.List;

public interface iGestacaoService {

    public GestacaoCadastroDTO adicionarGestacao(GestacaoCadastroDTO gestacaoDTO);
    
    public VisualizarGestacaoDTO obterGestacaoPorId(Long id);
    
    public boolean gestacaoExiste(Long id);
    
    public VisualizarGestacaoDTO obterGestacaoPorGestante(Gestante gestante);
    
    public List<VisualizarGestacaoDTO> obterTodasGestacoes();
    
    public AtualizarGestacaoDTO atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO);
    
    public void deletarGestacao(Long id);

}
