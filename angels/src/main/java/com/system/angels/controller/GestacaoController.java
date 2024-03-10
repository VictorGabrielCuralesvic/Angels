package com.system.angels.controller;

import java.util.List;

import com.system.angels.domain.Gestante;
import com.system.angels.service.impl.GestacaoService;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
@RequiredArgsConstructor
public class GestacaoController {

    private final GestacaoService service;

    private final GestanteService gestanteService;

    @GetMapping
    public ResponseEntity<List<Gestacao>> obterTodasGestacoes() {
        List<Gestacao> gestacoes = service.obterTodasGestacoes();
        return ResponseEntity.ok(gestacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarGestacaoDTO> obterGestacaoPorId(@PathVariable Long id) {
        Gestacao gestacaoDTO = service.obterGestacaoPorId(id);
        VisualizarGestacaoDTO visualizarGestacaoDTO = new VisualizarGestacaoDTO(gestacaoDTO);
        return ResponseEntity.ok(visualizarGestacaoDTO);
    }

    @PostMapping("/{gestanteId}")
    public ResponseEntity<GestacaoCadastroDTO> adicionarGestacao(@PathVariable Long gestanteId, @RequestBody GestacaoCadastroDTO gestacaoDTO) {
        Gestacao gestacao = new Gestacao();
        Gestante gestante = gestanteService.buscarGestantePorId(gestanteId);

        gestacao.setGestante(gestante);
        gestacao.setConsumoAlcool(gestacaoDTO.isConsumoAlcool());
        gestacao.setFrequenciaUsoAlcool(gestacaoDTO.getFrequenciaUsoAlcool());
        gestacao.setDataUltimaMenstruacao(gestacaoDTO.getDataUltimaMenstruacao());
        gestacao.setDataInicioGestacao(gestacaoDTO.getDataInicioGestacao());
        gestacao.setFatorRh(gestacaoDTO.getFatorRh());
        gestacao.setFuma(gestacaoDTO.isFuma());
        gestacao.setQuantidadeCigarrosDia(gestacaoDTO.getQuantidadeCigarrosDia());
        gestacao.setUsoDrogas(gestacaoDTO.getUsoDrogas());
        gestacao.setGravidezPlanejada(gestacaoDTO.isGravidezPlanejada());
        gestacao.setGrupoSanguineo(gestacaoDTO.getGrupoSanguineo());
        gestacao.setPesoAntesGestacao(gestacaoDTO.getPesoAntesGestacao());
        gestacao.setRiscoGestacional(gestacaoDTO.getRiscoGestacional());
        gestacao.setVacinaHepatiteB(gestacaoDTO.isVacinaHepatiteB());
        gestacao.setSituacaoGestacional(gestacaoDTO.getSituacaoGestacional());

        Gestacao gestacaoAdicionada = service.adicionarGestacao(gestacao);

        GestacaoCadastroDTO gestacaoAdicionadaDTO = new GestacaoCadastroDTO(gestacaoAdicionada);

        return ResponseEntity.status(HttpStatus.CREATED).body(gestacaoAdicionadaDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AtualizarGestacaoDTO> atualizarGestacao(@PathVariable Long id, @RequestBody Gestacao atualizarGestacaoDTO) {
        Gestacao gestacao = service.atualizarGestacao(id, atualizarGestacaoDTO);
        AtualizarGestacaoDTO gestacaoDTO = new AtualizarGestacaoDTO(gestacao);
        return ResponseEntity.ok(gestacaoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGestacao(@PathVariable Long id) {
        service.deletarGestacao(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/gestacao/{gestanteId}")
    public ResponseEntity<List<Gestacao>> listarGestacaoPorGestanteId(@PathVariable Long gestanteId) {
        List<Gestacao> gestacaos = service.listarGestacaoPorGestanteId(gestanteId);
        return ResponseEntity.ok(gestacaos);
    }

}
