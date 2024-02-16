package com.system.angels.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.angels.repository.GestacaoRepository;
import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.dto.VisualizarGestacaoDTO;
import com.system.angels.service.iGestacaoService;

@Service
public class GestacaoService implements iGestacaoService {

    private final GestacaoRepository gestacaoRepository;

    @Autowired
    public GestacaoService(GestacaoRepository gestacaoRepository) {
        this.gestacaoRepository = gestacaoRepository;
    }

    @Override
    public Gestacao adicionarGestacao(GestacaoCadastroDTO gestacaoDTO) {
        Gestacao gestacao = new Gestacao();
        gestacao.setGestante_id(gestacaoDTO.getGestante_id());
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

        return gestacaoRepository.save(gestacao);
    }

    @Override
    public Gestacao obterGestacaoPorId(Long id) {
        Optional<Gestacao> gestacao = gestacaoRepository.findById(id);

        if (gestacao.isEmpty()) {
            throw new RuntimeException("Não existe uma gestacão associada ao id.");
        }
        return gestacao.get();
    }

    @Override
    public Gestacao obterGestacaoPorGestante(Long gestante_id) {
        Optional<Gestacao> gestacao = gestacaoRepository.findById(gestante_id);
        if (gestacao.isEmpty()) {
            throw new RuntimeException("Não existe uma gestação associada a essa gestante.");
        }
        return gestacao.get();
    }

    @Override
    public boolean gestacaoExiste(Long id) {
        if (id != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return gestacaoRepository.findAll();
    }

    @Override
    public Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO) {
        
        if (gestacaoRepository.existsById(gestacaoDTO.getId())) {
            
            Gestacao gestacaoExistente = gestacaoRepository.findById(gestacaoDTO.getId()).orElse(null);
            if (gestacaoExistente != null) {
                
                gestacaoExistente.setConsumoAlcool(gestacaoDTO.isConsumoAlcool());
                gestacaoExistente.setFrequenciaUsoAlcool(gestacaoDTO.getFrequenciaUsoAlcool());
                gestacaoExistente.setDataUltimaMenstruacao(gestacaoDTO.getDataUltimaMenstruacao());
                gestacaoExistente.setDataInicioGestacao(gestacaoDTO.getDataInicioGestacao());
                gestacaoExistente.setFatorRh(gestacaoDTO.getFatorRh());
                gestacaoExistente.setFuma(gestacaoDTO.isFuma());
                gestacaoExistente.setQuantidadeCigarrosDia(gestacaoDTO.getQuantidadeCigarrosDia());
                gestacaoExistente.setUsoDrogas(gestacaoDTO.getUsoDrogas());
                gestacaoExistente.setGravidezPlanejada(gestacaoDTO.isGravidezPlanejada());
                gestacaoExistente.setGrupoSanguineo(gestacaoDTO.getGrupoSanguineo());
                gestacaoExistente.setPesoAntesGestacao(gestacaoDTO.getPesoAntesGestacao());
                gestacaoExistente.setRiscoGestacional(gestacaoDTO.getRiscoGestacional());
                gestacaoExistente.setVacinaHepatiteB(gestacaoDTO.isVacinaHepatiteB());
                gestacaoExistente.setSituacaoGestacional(gestacaoDTO.getSituacaoGestacional());

                return gestacaoRepository.save(gestacaoExistente);
            }
        }
    
        return null;
    }

    @Override
    public void deletarGestacao(Long id) {
        Gestacao gestacao = obterGestacaoPorId(id);
        gestacaoRepository.delete(gestacao);
    }

}
