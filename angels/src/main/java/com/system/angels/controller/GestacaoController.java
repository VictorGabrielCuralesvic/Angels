package com.system.angels.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.system.angels.domain.Gestacao;
import com.system.angels.domain.Gestante;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.impl.GestacaoService;

public class GestacaoController {

    private final GestacaoService service;

    @GetMapping
    public ResponseEntity<List<Gestacao>> obterTodasGestacoes() {
        List<Gestacao> gestacoes = service.obterTodasGestacoes();
        return ResponseEntity.ok(gestacoes);
    }

    @GetMapping("/{id}")
    //TODO

    @PostMapping
    public ResponseEntity<Gestacao> adicionarGestacao(@RequestBody GestacaoCadastroDTO gestacaoDTO) {
        Gestacao gestacao = service.adicionarGestacao(gestacaoDTO);
        return ResponseEntity.ok(gestacao);
    }


    @PutMapping("/{id}")
    //TODO
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGestacao(@PathVariable Long id) {
        service.deletarGestacao(id);
        return ResponseEntity.noContent().build();
    }
}
