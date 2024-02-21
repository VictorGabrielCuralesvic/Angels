package com.system.angels.service.impl;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import com.system.angels.repository.DadosEvolutivosRepository;
import com.system.angels.service.iDadosEvolutivosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DadosEvolutivosService implements iDadosEvolutivosService {

    private final DadosEvolutivosRepository repositorio;

    public List<DadosEvolutivos> listarDadosEvolutivos() {
        return repositorio.findAll();
    }

    public List<DadosEvolutivos> listarDadosEvolutivosPorGestante(Gestante gestante) {
        List<DadosEvolutivos> dadosEvolutivos = repositorio.findAllByGestante_id(gestante.getId());
        return dadosEvolutivos;
    }

    public DadosEvolutivos ultimosDadosEvolutivosPorGestante(Gestante gestante) {
        List<DadosEvolutivos> listaDeDadosEvolutivos = listarDadosEvolutivos();

        DadosEvolutivos ultimosDadosEvolutivos = listaDeDadosEvolutivos.get(listaDeDadosEvolutivos.size() - 1);

        return ultimosDadosEvolutivos;
    }

    public DadosEvolutivos buscarDadosEvolutivosPorId(Long id) {
        Optional<DadosEvolutivos> dadosEvolutivos = repositorio.findById(id);

        if (dadosEvolutivos.isEmpty()) {
            throw new RuntimeException("Não foram encontrados dados evolutivos associados a esse ID.");
        }

        return dadosEvolutivos.get();
    }

    public DadosEvolutivos registrarDadosEvolutivos(DadosEvolutivos dadosEvolutivos) {
        return repositorio.save(dadosEvolutivos);
    }

    public DadosEvolutivos atualizarDadosEvolutivos(DadosEvolutivos dadosEvolutivosAtualizados) {
        DadosEvolutivos dadosEvolutivos = buscarDadosEvolutivosPorId(dadosEvolutivosAtualizados.getId());

        dadosEvolutivos.setMunicipio(dadosEvolutivosAtualizados.getMunicipio());
        dadosEvolutivos.setDiagnosticoDesnutricao(dadosEvolutivosAtualizados.getDiagnosticoDesnutricao());
        dadosEvolutivos.setEnergiaEletricaDomicilio(dadosEvolutivosAtualizados.isEnergiaEletricaDomicilio());
        dadosEvolutivos.setEscolaridade(dadosEvolutivosAtualizados.getEscolaridade());
        dadosEvolutivos.setTipoMoradia(dadosEvolutivosAtualizados.getTipoMoradia());
        dadosEvolutivos.setMoradiaRedeEsgoto(dadosEvolutivosAtualizados.isMoradiaRedeEsgoto());
        dadosEvolutivos.setRendaFamiliar(dadosEvolutivosAtualizados.getRendaFamiliar());
        dadosEvolutivos.setTratamentoAgua(dadosEvolutivosAtualizados.isTratamentoAgua());
        dadosEvolutivos.setAmamentacao(dadosEvolutivosAtualizados.isAmamentacao());
        dadosEvolutivos.setChefeFamilia(dadosEvolutivosAtualizados.getChefeFamilia());
        dadosEvolutivos.setDataUltimaGestacao(dadosEvolutivosAtualizados.getDataUltimaGestacao());
        dadosEvolutivos.setEmRisco(dadosEvolutivosAtualizados.isEmRisco());
        dadosEvolutivos.setEstadoCivil(dadosEvolutivosAtualizados.getEstadoCivil());
        dadosEvolutivos.setQuantidadeAbortos(dadosEvolutivosAtualizados.getQuantidadeAbortos());
        dadosEvolutivos.setQuantidadeFilhosVivos(dadosEvolutivosAtualizados.getQuantidadeFilhosVivos());
        dadosEvolutivos.setQuantidadeGemelares(dadosEvolutivosAtualizados.getQuantidadeGemelares());
        dadosEvolutivos.setQuantidadeGestacao(dadosEvolutivosAtualizados.getQuantidadeGestacao());
        dadosEvolutivos.setQuantidadeNascidosMortos(dadosEvolutivosAtualizados.getQuantidadeNascidosMortos());
        dadosEvolutivos.setQuantidadeNascidosVivos(dadosEvolutivosAtualizados.getQuantidadeNascidosVivos());
        dadosEvolutivos.setQuantidadeObitosSemana1(dadosEvolutivosAtualizados.getQuantidadeObitosSemana1());
        dadosEvolutivos.setQuantidadeObitosAposSemana1(dadosEvolutivosAtualizados.getQuantidadeObitosAposSemana1());
        dadosEvolutivos.setQuantidadePartos(dadosEvolutivosAtualizados.getQuantidadePartos());
        dadosEvolutivos.setQuantidadePartosCesarios(dadosEvolutivosAtualizados.getQuantidadePartosCesarios());
        dadosEvolutivos.setQuantidadePartosVaginais(dadosEvolutivosAtualizados.getQuantidadePartosVaginais());
        dadosEvolutivos.setQuantidadeRnPeso2500_4000(dadosEvolutivosAtualizados.getQuantidadeRnPeso2500_4000());
        dadosEvolutivos.setQuantidadeRnPesoMaior4000(dadosEvolutivosAtualizados.getQuantidadeRnPesoMaior4000());
        dadosEvolutivos.setQuantidadeRnPesoMenor2500(dadosEvolutivosAtualizados.getQuantidadeRnPesoMenor2500());
        dadosEvolutivos.setHipertensao(dadosEvolutivosAtualizados.isHipertensao());
        dadosEvolutivos.setDiabetes(dadosEvolutivosAtualizados.isDiabetes());
        dadosEvolutivos.setCirurgiaPelvica(dadosEvolutivosAtualizados.isCirurgiaPelvica());
        dadosEvolutivos.setInfeccaoUrinaria(dadosEvolutivosAtualizados.isInfeccaoUrinaria());
        dadosEvolutivos.setMaFormacaoCongenita(dadosEvolutivosAtualizados.isMaFormacaoCongenita());
        dadosEvolutivos.setFamiliarGemeos(dadosEvolutivosAtualizados.isFamiliarGemeos());
        dadosEvolutivos.setContato(dadosEvolutivosAtualizados.getContato());
        dadosEvolutivos.setContatoEmergencia(dadosEvolutivosAtualizados.getContatoEmergencia());

        return registrarDadosEvolutivos(dadosEvolutivos);
    }

    public void deletarDadosEvolutivos(Long id) {
        DadosEvolutivos dadosEvolutivos = buscarDadosEvolutivosPorId(id);

        repositorio.delete(dadosEvolutivos);
    }
}
