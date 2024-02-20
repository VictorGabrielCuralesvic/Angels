package com.system.angels.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.system.angels.domain.DadosAtivos;
import com.system.angels.dto.CadastrarDadosAtivosDTO;
import com.system.angels.repository.DadosAtivosRepository;
import com.system.angels.service.iDadosAtivosService;
import org.springframework.beans.BeanUtils;

public class DadosAtivosService implements iDadosAtivosService {

    private final DadosAtivosRepository dadosAtivosRepository;

    public DadosAtivosService(DadosAtivosRepository dadosAtivosRepository) {
        this.dadosAtivosRepository = dadosAtivosRepository;
    }

    @Override
    public CadastrarDadosAtivosDTO criarDadosAtivos(CadastrarDadosAtivosDTO cadastrarDadosAtivosDTO) {
        DadosAtivos dadosAtivos = new DadosAtivos();
        BeanUtils.copyProperties(cadastrarDadosAtivosDTO, dadosAtivos);
        cadastrarDadosAtivosDTO.setGestante_id(dadosAtivos.getGestante_id());
        dadosAtivosRepository.save(dadosAtivos);
        return cadastrarDadosAtivosDTO;
    }
}
