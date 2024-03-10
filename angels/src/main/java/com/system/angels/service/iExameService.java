package com.system.angels.service;

import com.system.angels.domain.Exame;

import java.util.List;

public interface iExameService {

    List<Exame> obterTodosExames();

    Exame buscarExamePorId(Long id);

    //List<Exame> obterPorResultado();

}
