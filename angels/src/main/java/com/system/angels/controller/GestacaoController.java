package com.system.angels.controller;

import java.util.List;

import com.system.angels.domain.Gestante;
import com.system.angels.dto.create.CadastrarGestacaoDTO;
import com.system.angels.service.impl.GestacaoService;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.system.angels.domain.Gestacao;
import com.system.angels.dto.update.AtualizarGestacaoDTO;
import com.system.angels.dto.response.VisualizarGestacaoDTO;

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
    public ResponseEntity<CadastrarGestacaoDTO> adicionarGestacao(@PathVariable Long gestanteId, @RequestBody CadastrarGestacaoDTO gestacaoDTO) {
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

        CadastrarGestacaoDTO gestacaoAdicionadaDTO = new CadastrarGestacaoDTO(gestacaoAdicionada);

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
