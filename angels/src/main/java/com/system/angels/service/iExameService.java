package com.system.angels.service;

import com.system.angels.dto.AtualizarExameDTO;
import com.system.angels.dto.ExameDTO;
import com.system.angels.dto.RemoverExameDTO;
import com.system.angels.dto.VisualizarExameDTO;

public interface iExameService {
    ExameDTO criarExame(ExameDTO exameDTO);
    VisualizarExameDTO visualizarExame(Long id);

    AtualizarExameDTO atualizarExame(AtualizarExameDTO atualizarExameDTO);

    void removerExame(RemoverExameDTO removerExameDTO);
}
