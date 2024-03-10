package com.system.angels.service.impl;

import com.system.angels.domain.Acompanhamento;
import com.system.angels.dto.CadastroAcompanhamentoDTO;
import com.system.angels.repository.AcompanhamentoRepository;
import com.system.angels.service.iAcompanhamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AcompanhamentoService implements iAcompanhamentoService {

    private final AcompanhamentoRepository repositorio;

    public List<Acompanhamento> listarAcompanhamentos() {
        return repositorio.findAll();
    }

    public Acompanhamento buscarAcompanhamentoPorId(Long id) throws RuntimeException {
        Optional<Acompanhamento> acompanhamento = repositorio.findById(id);

        if (acompanhamento.isEmpty()) {
            throw new RuntimeException("Não existe um acompanhamento associado a esse id.");
        }

        return acompanhamento.get();
    }

    public Acompanhamento registrarAcompanhamento(Acompanhamento acompanhamento) {
        return repositorio.save(acompanhamento);
    }

    public void deletarAcompanhamento(Long id) {
        Acompanhamento acompanhamento = buscarAcompanhamentoPorId(id);
        repositorio.delete(acompanhamento);
    }

    public Acompanhamento atualizarAcompanhamento(Long id, Acompanhamento acompanhamentoAtualizado) {
        Acompanhamento acompanhamento = buscarAcompanhamentoPorId(id);
        acompanhamento.setDataAcompanhamento(acompanhamentoAtualizado.getDataAcompanhamento());
        acompanhamento.setRealizadoPor(acompanhamentoAtualizado.getRealizadoPor());
        acompanhamento.setPesoAtual(acompanhamentoAtualizado.getPesoAtual());
        acompanhamento.setIdadeGestacional(acompanhamentoAtualizado.getIdadeGestacional());
        acompanhamento.setPressaoArterial(acompanhamentoAtualizado.getPressaoArterial());
        acompanhamento.setBatimentosCardiacosFeto(acompanhamentoAtualizado.getBatimentosCardiacosFeto());
        acompanhamento.setAlturaUterina(acompanhamentoAtualizado.getAlturaUterina());
        acompanhamento.setTipo(acompanhamentoAtualizado.getTipo());

        return repositorio.save(acompanhamento);
    }

    public List<Acompanhamento> listarAcompanhamentoPorGestacaoId(Long gestacaoId) {
        return repositorio.findByGestacaoId(gestacaoId);
    }
}
