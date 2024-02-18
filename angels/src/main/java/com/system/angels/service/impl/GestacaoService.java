package com.system.angels.service.impl;

import java.util.List;
import java.util.Optional;

import com.system.angels.domain.Gestante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.angels.repository.GestacaoRepository;
import com.system.angels.domain.Gestacao;
import com.system.angels.dto.AtualizarGestacaoDTO;
import com.system.angels.dto.GestacaoCadastroDTO;
import com.system.angels.service.iGestacaoService;

@Service
public class GestacaoService implements iGestacaoService {

    private GestacaoRepository gestacaoRepository;

    @Override
    public Gestacao adicionarGestacao(GestacaoCadastroDTO gestacaoDTO) {
        Gestacao gestacao = new Gestacao();
        gestacao.setGestante(gestacaoDTO.getGestante());
        gestacao.setConsumoAlcool(gestacaoDTO.isConsumoAlcool());
        gestacao.setFrequenciaUsoAlcool(gestacao.getFrequenciaUsoAlcool());
        gestacao.setDataUltimaMenstruacao(gestacaoDTO.getDataUltimaMenstruacao());
        gestacao.setDataInicioGestacao(gestacaoDTO.getDataInicioGestacao());
        gestacao.setFatorRh(gestacaoDTO.getFatorRh());
        gestacao.setFuma(gestacaoDTO.isFuma());
        gestacao.setQuantidadeCigarrosDia(gestacaoDTO.getQuantidadeCigarrosDia());
        gestacao.setUsoDrogas(gestacaoDTO.getUsoDrogas());
        gestacao.setGravidezPlanejada(gestacaoDTO.isGravidezPlanejada());
        gestacao.setGrupoSanguineo(Integer.parseInt(gestacaoDTO.getGrupoSanguineo()));
        gestacao.setPesoAntesGestacao(gestacaoDTO.getPesoAntesGestacao());
        gestacao.setRiscoGestacional(gestacaoDTO.getRiscoGestacional());
        gestacao.setVacinaHepatiteB(gestacaoDTO.isVacinaHepatiteB());
        gestacao.setSituacaoGestacional(gestacaoDTO.getSituacaoGestacional());

        return gestacaoRepository.save(gestacao);
    }

    @Override
    public Gestacao obterGestacaoPorId(Long id) {
        return null;
    }

    @Override
    public Gestacao obterGestacaoPorGestante(Long gestante_id) {
        return null;
    }

    @Override
    public boolean gestacaoExiste(Long id) {
        return false;
    }

    @Override
    public List<Gestacao> obterTodasGestacoes() {
        return null;
    }

    @Override
    public Gestacao atualizarGestacao(AtualizarGestacaoDTO gestacaoDTO) {
        return null;
    }

    @Override
    public void deletarGestacao(Long id) {

    }
}
