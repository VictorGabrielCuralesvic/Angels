package com.system.angels.service;

import com.system.angels.domain.Exame;
import com.system.angels.dto.AtualizarExameDTO;
import com.system.angels.dto.ExameDTO;
import com.system.angels.dto.RemoverExameDTO;
import com.system.angels.dto.VisualizarExameDTO;

import java.util.List;

public interface iExameService {

    List<Exame> obterTodosExames();

    Exame buscarExamePorId(Long id);

    //List<Exame> obterPorResultado();

}
