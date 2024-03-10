package com.system.angels.controller;

import com.system.angels.domain.Acompanhamento;
import com.system.angels.domain.Exame;
import com.system.angels.dto.create.CadastrarExameDTO;
import com.system.angels.dto.response.VisualizarExameDTO;
import com.system.angels.service.impl.AcompanhamentoService;
import com.system.angels.service.impl.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exames")
public class ExameController {

    private final ExameService exameService;

    private final AcompanhamentoService acompanhamentoService;

    @Autowired
    public ExameController(ExameService exameService, AcompanhamentoService acompanhamentoService) {
        this.exameService = exameService;
        this.acompanhamentoService = acompanhamentoService;
    }

    @PostMapping("/{acompanhamentoId}")
    public ResponseEntity<CadastrarExameDTO> criarExame(@PathVariable Long acompanhamentoId, @RequestBody CadastrarExameDTO exameDTO) {
        Exame exame = new Exame();
        Acompanhamento acompanhamento = acompanhamentoService.buscarAcompanhamentoPorId(acompanhamentoId);

        exame.setAcompanhamento(acompanhamento);
        exame.setTipo(exameDTO.getTipo());
        exame.setResultado(exameDTO.getResultado());
        exame.setObservacao(exameDTO.getObservacao());

        Exame adicionaExame = exameService.criarExame(exame);

        CadastrarExameDTO adicionaExameDTO = new CadastrarExameDTO(adicionaExame);

        return ResponseEntity.status(HttpStatus.CREATED).body(adicionaExameDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarExameDTO> buscarExamePorId(@PathVariable Long id) {
        Exame exame = exameService.buscarExamePorId(id);
        VisualizarExameDTO visualizarExameDTO = new VisualizarExameDTO(exame);
        return ResponseEntity.ok(visualizarExameDTO);
    }

    @GetMapping
    public ResponseEntity<List<Exame>> obterTodosExames() {
        List<Exame> exames = exameService.obterTodosExames();
        return ResponseEntity.ok(exames);
    }

    //PutMapping("/{id}")
    //public ResponseEntity<AtualizarExameDTO> atualizarExame(@PathVariable Long id, @RequestBody AtualizarExameDTO atualizarExameDTO) {
    //    Exame exame = exameService.
    //    AtualizarExameDTO atualizadoExameDTO = exameService.atualizarExame(atualizarExameDTO);
    //    return new ResponseEntity<>(atualizadoExameDTO, HttpStatus.OK);
    //}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExame(@PathVariable Long id) {
        exameService.deleteExame(id);
        return ResponseEntity.noContent().build();
    }
}
