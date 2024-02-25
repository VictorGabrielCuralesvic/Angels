package com.system.angels.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.system.angels.repository.GestacaoRepository;
import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.iGestacaoService;

@Service
public class GestacaoService implements iGestacaoService {

    private GestacaoRepository gestacaoRepository;

    public GestacaoService(GestacaoRepository gestacaoRepository) {
        this.gestacaoRepository = gestacaoRepository;
    }

    @Override
    public GestacaoCadastroDTO adicionarGestacao(GestacaoCadastroDTO gestacaoCadastroDTO) {
        Gestacao gestacao = new Gestacao();

        gestacao.setGestante_id(gestacaoCadastroDTO.getGestante_id());

        gestacao.setConsumoAlcool(gestacaoCadastroDTO.isConsumoAlcool());
        gestacao.setFrequenciaUsoAlcool(gestacaoCadastroDTO.getFrequenciaUsoAlcool());
        gestacao.setDataUltimaMenstruacao(gestacaoCadastroDTO.getDataUltimaMenstruacao());
        gestacao.setDataInicioGestacao(gestacaoCadastroDTO.getDataInicioGestacao());
        gestacao.setFatorRh(gestacaoCadastroDTO.getFatorRh());
        gestacao.setFuma(gestacaoCadastroDTO.isFuma());
        gestacao.setQuantidadeCigarrosDia(gestacaoCadastroDTO.getQuantidadeCigarrosDia());
        gestacao.setUsoDrogas(gestacaoCadastroDTO.getUsoDrogas());
        gestacao.setGravidezPlanejada(gestacaoCadastroDTO.isGravidezPlanejada());
        gestacao.setGrupoSanguineo(gestacaoCadastroDTO.getGrupoSanguineo());
        gestacao.setPesoAntesGestacao(gestacaoCadastroDTO.getPesoAntesGestacao());
        gestacao.setRiscoGestacional(gestacaoCadastroDTO.getRiscoGestacional());
        gestacao.setVacinaHepatiteB(gestacaoCadastroDTO.isVacinaHepatiteB());
        gestacao.setSituacaoGestacional(gestacaoCadastroDTO.getSituacaoGestacional());
        return gestacaoCadastroDTO;
    }

    @Override
    public VisualizarGestacaoDTO obterGestacaoPorId(Long id) {
        Optional<Gestacao> gestacaoOptional = gestacaoRepository.findById(id);
        if (gestacaoOptional.isPresent()) {
            Gestacao gestacao = gestacaoOptional.get();
            VisualizarGestacaoDTO visualizarGestacaoDTO = new VisualizarGestacaoDTO();
            visualizarGestacaoDTO.setId(gestacao.getId());
            visualizarGestacaoDTO.setConsumoAlcool(gestacao.isConsumoAlcool());
            visualizarGestacaoDTO.setFrequenciaUsoAlcool(gestacao.getFrequenciaUsoAlcool());
            visualizarGestacaoDTO.setDataUltimaMenstruacao(gestacao.getDataUltimaMenstruacao());
            visualizarGestacaoDTO.setDataInicioGestacao(gestacao.getDataInicioGestacao());
            visualizarGestacaoDTO.setFatorRh(gestacao.getFatorRh());
            visualizarGestacaoDTO.setFuma(gestacao.isFuma());
            visualizarGestacaoDTO.setQuantidadeCigarrosDia(gestacao.getQuantidadeCigarrosDia());
            visualizarGestacaoDTO.setUsoDrogas(gestacao.getUsoDrogas());
            visualizarGestacaoDTO.setGravidezPlanejada(gestacao.isGravidezPlanejada());
            visualizarGestacaoDTO.setGrupoSanguineo(gestacao.getGrupoSanguineo());
            visualizarGestacaoDTO.setPesoAntesGestacao(gestacao.getPesoAntesGestacao());
            visualizarGestacaoDTO.setRiscoGestacional(gestacao.getRiscoGestacional());
            visualizarGestacaoDTO.setVacinaHepatiteB(gestacao.isVacinaHepatiteB());
            visualizarGestacaoDTO.setSituacaoGestacional(gestacao.getSituacaoGestacional());
            return visualizarGestacaoDTO;
        } else {
            throw new RuntimeException(("Gestação não encontrada"));
        }
    }

    @Override
    public VisualizarGestacaoDTO obterGestacaoPorGestante(Long gestante_id) {
        return null;
    }

    @Override
    public boolean gestacaoExiste(Long id) {
        return gestacaoRepository.existsById(id);
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return gestacaoRepository.findAll();
    }

    @Override
    public AtualizarGestacaoDTO atualizarGestacao(Long id, AtualizarGestacaoDTO atualizarGestacaoDTO) {
        Optional<Gestacao> gestacaoOptional = gestacaoRepository.findById(atualizarGestacaoDTO.getId());
        if (gestacaoOptional.isPresent()) {
            Gestacao gestacao = gestacaoOptional.get();
            gestacao.setConsumoAlcool(atualizarGestacaoDTO.isConsumoAlcool());
            gestacao.setFrequenciaUsoAlcool(atualizarGestacaoDTO.getFrequenciaUsoAlcool());
            gestacao.setDataUltimaMenstruacao(atualizarGestacaoDTO.getDataUltimaMenstruacao());
            gestacao.setDataInicioGestacao(atualizarGestacaoDTO.getDataInicioGestacao());
            gestacao.setFatorRh(atualizarGestacaoDTO.getFatorRh());
            gestacao.setFuma(atualizarGestacaoDTO.isFuma());
            gestacao.setQuantidadeCigarrosDia(atualizarGestacaoDTO.getQuantidadeCigarrosDia());
            gestacao.setUsoDrogas(atualizarGestacaoDTO.getUsoDrogas());
            gestacao.setGravidezPlanejada(atualizarGestacaoDTO.isGravidezPlanejada());
            gestacao.setGrupoSanguineo(atualizarGestacaoDTO.getGrupoSanguineo());
            gestacao.setPesoAntesGestacao(atualizarGestacaoDTO.getPesoAntesGestacao());
            gestacao.setRiscoGestacional(atualizarGestacaoDTO.getRiscoGestacional());
            gestacao.setVacinaHepatiteB(atualizarGestacaoDTO.isVacinaHepatiteB());
            gestacao.setSituacaoGestacional(atualizarGestacaoDTO.getSituacaoGestacional());
            return atualizarGestacaoDTO;
        } else {
            throw new RuntimeException("Gestação não encontrada");
        }
    }

    @Override
    public void deletarGestacao(Long id) {
        gestacaoRepository.deleteById(id);
    }
}
