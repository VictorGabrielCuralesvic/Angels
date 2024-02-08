package com.system.angels.service;

import com.system.angels.domain.Gestante;
import com.system.angels.dto.GestacaoDTO;
import java.util.List;

public interface iGestacaoService {

    public GestacaoDTO adicionarGestacao(GestacaoDTO gestacaoDTO);

    public GestacaoDTO salvarGestacao(GestacaoDTO gestacaoDTO);

    public GestacaoDTO obterGestacaoPorId(Long id);

    public boolean gestacaoExiste(Long id);

    public GestacaoDTO obterGestacaoPorGestante(Gestante gestante);

    public List<GestacaoDTO> obterTodasGestacoes();

    public void deletarGestacao(Long id);

}
