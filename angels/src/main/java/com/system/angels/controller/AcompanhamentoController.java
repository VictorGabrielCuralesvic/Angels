package com.system.angels.controller;


import com.system.angels.domain.Acompanhamento;
import com.system.angels.dto.CadastroAcompanhamentoDTO;
import com.system.angels.dto.VisualizarAcompanhamentoDTO;
import com.system.angels.service.impl.AcompanhamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acompanhamentos")
@RequiredArgsConstructor
public class AcompanhamentoController {

    private final AcompanhamentoService service;

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
}
