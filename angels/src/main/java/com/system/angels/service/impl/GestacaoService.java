package com.system.angels.service.impl;

import java.util.List;
import java.util.Optional;

import com.system.angels.domain.Gestante;
import org.springframework.stereotype.Service;
import com.system.angels.repository.GestacaoRepository;
import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.iGestacaoService;

@Service
public class GestacaoService implements iGestacaoService {

    public GestacaoRepository gestacaoRepository;

    public GestacaoService(GestacaoRepository gestacaoRepository) {
        this.gestacaoRepository = gestacaoRepository;
    }

    public Gestacao adicionarGestacao(Gestacao gestacao) {
        return gestacaoRepository.save(gestacao);
    }

    @Override
    public Gestacao obterGestacaoPorId(Long id) {
        Optional<Gestacao> gestacao = gestacaoRepository.findById(id);

        if (gestacao.isPresent()) {
            return gestacao.get();
        } else {
            throw new RuntimeException("Gestação não encontrada");
        }
    }

    //@Override
    //public VisualizarGestacaoDTO obterGestacaoPorGestante(Long gestante_id) {
    //    return null;
    //}

    @Override
    public boolean gestacaoExiste(Long id) {
        return gestacaoRepository.existsById(id);
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return gestacaoRepository.findAll();
    }

    public Gestacao atualizarGestacao(Long id, Gestacao atualizarGestacao) {
        Optional<Gestacao> gestacaoOptional = gestacaoRepository.findById(atualizarGestacao.getId());
        if (gestacaoOptional.isPresent()) {
            Gestacao gestacao = gestacaoOptional.get();
            gestacao.setConsumoAlcool(atualizarGestacao.isConsumoAlcool());
            gestacao.setFrequenciaUsoAlcool(atualizarGestacao.getFrequenciaUsoAlcool());
            gestacao.setDataUltimaMenstruacao(atualizarGestacao.getDataUltimaMenstruacao());
            gestacao.setDataInicioGestacao(atualizarGestacao.getDataInicioGestacao());
            gestacao.setFatorRh(atualizarGestacao.getFatorRh());
            gestacao.setFuma(atualizarGestacao.isFuma());
            gestacao.setQuantidadeCigarrosDia(atualizarGestacao.getQuantidadeCigarrosDia());
            gestacao.setUsoDrogas(atualizarGestacao.getUsoDrogas());
            gestacao.setGravidezPlanejada(atualizarGestacao.isGravidezPlanejada());
            gestacao.setGrupoSanguineo(atualizarGestacao.getGrupoSanguineo());
            gestacao.setPesoAntesGestacao(atualizarGestacao.getPesoAntesGestacao());
            gestacao.setRiscoGestacional(atualizarGestacao.getRiscoGestacional());
            gestacao.setVacinaHepatiteB(atualizarGestacao.isVacinaHepatiteB());
            gestacao.setSituacaoGestacional(atualizarGestacao.getSituacaoGestacional());
            return atualizarGestacao;
        } else {
            throw new RuntimeException("Gestação não encontrada");
        }

    }

    public void deletarGestacao(Long id) {
        gestacaoRepository.deleteById(id);
    }

    public List<Gestacao> listarGestacaoPorGestanteId(Long gestanteId) {
        return gestacaoRepository.findByGestanteId(gestanteId);
    }

}
