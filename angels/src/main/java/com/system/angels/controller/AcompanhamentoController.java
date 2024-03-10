package com.system.angels.controller;


import com.system.angels.domain.Acompanhamento;
import com.system.angels.domain.Gestante;
import com.system.angels.dto.create.CadastrarAcompanhamentoDTO;
import com.system.angels.dto.VisualizarAcompanhamentoDTO;
import com.system.angels.service.impl.AcompanhamentoService;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acompanhamentos")
@RequiredArgsConstructor
public class AcompanhamentoController {

    private final AcompanhamentoService service;

    private final GestanteService gestanteService;

    @GetMapping
    public ResponseEntity<List<Acompanhamento>> listarAcompanhamentos() {
        List<Acompanhamento> acompanhamentos = service.listarAcompanhamentos();
        return ResponseEntity.ok(acompanhamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarAcompanhamentoDTO> buscarAcompanhamentoPorId(@PathVariable Long id) {
        Acompanhamento acompanhamento = service.buscarAcompanhamentoPorId(id);
        VisualizarAcompanhamentoDTO acompanhamentoDTO = new VisualizarAcompanhamentoDTO(acompanhamento);
        return ResponseEntity.ok(acompanhamentoDTO);
    }

    @PostMapping("/{gestanteId}")
    public ResponseEntity<CadastrarAcompanhamentoDTO> cadastrarAcompanhamento(@PathVariable Long gestanteId, @RequestBody CadastrarAcompanhamentoDTO cadastroAcompanhamentoDTO) {
        Acompanhamento acompanhamento = new Acompanhamento();
        Gestante gestante = gestanteService.buscarGestantePorId(gestanteId);

        acompanhamento.setGestante(gestante);
        acompanhamento.setDataAcompanhamento(cadastroAcompanhamentoDTO.getDataAcompanhamento());
        acompanhamento.setRealizadoPor(cadastroAcompanhamentoDTO.getRealizadoPor());
        acompanhamento.setPesoAtual(cadastroAcompanhamentoDTO.getPesoAtual());
        acompanhamento.setIdadeGestacional(cadastroAcompanhamentoDTO.getIdadeGestacional());
        acompanhamento.setPressaoArterial(cadastroAcompanhamentoDTO.getPressaoArterial());
        acompanhamento.setBatimentosCardiacosFeto(cadastroAcompanhamentoDTO.getBatimentosCardiacosFeto());
        acompanhamento.setAlturaUterina(cadastroAcompanhamentoDTO.getAlturaUterina());
        acompanhamento.setTipo(cadastroAcompanhamentoDTO.getTipo());

        Acompanhamento adicionadoAcompanhamento = service.registrarAcompanhamento(acompanhamento);

        CadastrarAcompanhamentoDTO adicionadoAcompnhamentoDTO = new CadastrarAcompanhamentoDTO(adicionadoAcompanhamento);

        return ResponseEntity.ok(adicionadoAcompnhamentoDTO);
    }

    @PutMapping("{id}")
    public ResponseEntity<VisualizarAcompanhamentoDTO> atualizarAcompanhamento(@PathVariable Long id, @RequestBody Acompanhamento acompanhamentoAtualziado) {
        Acompanhamento acompanhamento = service.atualizarAcompanhamento(id, acompanhamentoAtualziado);
        VisualizarAcompanhamentoDTO acompanhamentoDTO = new VisualizarAcompanhamentoDTO(acompanhamento);
        return ResponseEntity.ok(acompanhamentoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAcompanhamento(@PathVariable Long id) {
        service.deletarAcompanhamento(id);
        return ResponseEntity.noContent().build();
    }

}
