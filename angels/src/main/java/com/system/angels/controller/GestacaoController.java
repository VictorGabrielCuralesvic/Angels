package com.system.angels.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.iGestacaoService;

@RestController
@RequestMapping("/gestacoes")
public class GestacaoController {

    private final iGestacaoService service;

    public GestacaoController(iGestacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Gestacao>> obterTodasGestacoes() {
        List<Gestacao> gestacoes = service.obterTodasGestacoes();
        return ResponseEntity.ok(gestacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarGestacaoDTO> obterGestacaoPorId(@PathVariable Long id) {
        VisualizarGestacaoDTO gestacaoDTO = service.obterGestacaoPorId(id);
        return ResponseEntity.ok(gestacaoDTO);
    }

    @PostMapping
    public ResponseEntity<GestacaoCadastroDTO> adicionarGestacao(@RequestBody GestacaoCadastroDTO gestacaoDTO) {
        GestacaoCadastroDTO gestacao = service.adicionarGestacao(gestacaoDTO);
        return ResponseEntity.ok(gestacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AtualizarGestacaoDTO> atualizarGestacao(@PathVariable Long id, @RequestBody AtualizarGestacaoDTO atualizarGestacaoDTO) {
        AtualizarGestacaoDTO gestacaoDTO = service.atualizarGestacao(id, atualizarGestacaoDTO);
        return ResponseEntity.ok(gestacaoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGestacao(@PathVariable Long id) {
        service.deletarGestacao(id);
        return ResponseEntity.noContent().build();
    }
}
