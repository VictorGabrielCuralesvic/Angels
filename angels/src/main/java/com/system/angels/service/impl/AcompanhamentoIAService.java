package com.system.angels.service.impl;


import com.system.angels.domain.AcompanhamentoIA;
import com.system.angels.repository.AcompanhamentoIARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AcompanhamentoIAService {

    private final AcompanhamentoIARepository acompanhamentoIARepository;

    public List<AcompanhamentoIA> listarAcompanhamentoIA() {
        return acompanhamentoIARepository.findAll();
    }

    public AcompanhamentoIA buscarAcompanhamentoIAPorId(Long id) {
        Optional<AcompanhamentoIA> acompanhamentoIA = acompanhamentoIARepository.findById(id);

        return acompanhamentoIA.get();
    }

    public AcompanhamentoIA registrarAcompanhamentoIA(AcompanhamentoIA acompanhamentoIA) {
        return acompanhamentoIARepository.save(acompanhamentoIA);
    }
 }
