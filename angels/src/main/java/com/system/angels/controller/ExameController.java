package com.system.angels.controller;

import com.system.angels.dto.AtualizarExameDTO;
import com.system.angels.dto.ExameDTO;
import com.system.angels.dto.RemoverExameDTO;
import com.system.angels.dto.VisualizarExameDTO;
import com.system.angels.service.iExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exames")
public class ExameController {
1
    private final iExameService exameService;

    @Autowired
    public ExameController(iExameService exameService) {
        this.exameService = exameService;
    }

    @PostMapping
    public ResponseEntity<ExameDTO> criarExame(@RequestBody ExameDTO exameDTO) {
        ExameDTO createdExameDTO = exameService.criarExame(exameDTO);
        return new ResponseEntity<>(createdExameDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarExameDTO> visualizarExame(@PathVariable Long id) {
        VisualizarExameDTO visualizarExameDTO = exameService.visualizarExame(id);
        return new ResponseEntity<>(visualizarExameDTO, HttpStatus.OK);
    }

    @PutMapping("/atualizar-exame/{id}")
    public ResponseEntity<AtualizarExameDTO> atualizarExame(@RequestBody AtualizarExameDTO atualizarExameDTO) {
        AtualizarExameDTO atualizadoExameDTO = exameService.atualizarExame(atualizarExameDTO);
        return new ResponseEntity<>(atualizadoExameDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerExame(@PathVariable Long id) {
        RemoverExameDTO removerExameDTO = new RemoverExameDTO(id);
        exameService.removerExame(removerExameDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
