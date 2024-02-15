package com.system.angels.service.impl;

import com.system.angels.domain.Gestante;
import com.system.angels.repository.GestanteRepository;
import com.system.angels.service.iGestacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GestanteService implements iGestacaoService {
    public final GestanteRepository repositorio;

    public Gestante buscarGestantePorId(Long id) throws RuntimeException {
        Optional<Gestante> gestante = repositorio.findById(id);

        if (gestante.isEmpty()) {
            throw new RuntimeException("Não existe uma gestante associada a esse id.");
        }

        return gestante.get();
    }

    public Gestante buscarGestantePorCpf(String cpf) throws RuntimeException {
        Optional<Gestante> gestante = repositorio.findGestanteByCpf(cpf);

        if (gestante.isEmpty()) {
            throw new RuntimeException("Não existe uma gestante associada a esse cpf.");
        }

        return gestante.get();
    }

    public Gestante registrarGestante(Gestante gestante) {
        return repositorio.save(gestante);
    }

    public Gestante atualizarGestante(Long id, Gestante gestanteAtualizada) throws RuntimeException {
        Gestante gestante = buscarGestantePorId(id);
        gestante.setNome(gestanteAtualizada.getNome());
        gestante.setDataNascimento(gestanteAtualizada.getDataNascimento());
        gestante.setCpf(gestanteAtualizada.getCpf());
        gestante.setRaca(gestanteAtualizada.getRaca());
        gestante.setSexo(gestanteAtualizada.getSexo());
        gestante.setMunicipio(gestanteAtualizada.getMunicipio());
        gestante.setDiagnosticoDesnutricao(gestanteAtualizada.getDiagnosticoDesnutricao());
        gestante.setEnergiaEletricaDomicilio(gestanteAtualizada.isEnergiaEletricaDomicilio());
        gestante.setEscolaridade(gestanteAtualizada.getEscolaridade());
        gestante.setTipoMoradia(gestanteAtualizada.getTipoMoradia());
        gestante.setMoradiaRedeEsgoto(gestanteAtualizada.isMoradiaRedeEsgoto());
        gestante.setRendaFamiliar(gestanteAtualizada.getRendaFamiliar());
        gestante.setTratamentoAgua(gestanteAtualizada.isTratamentoAgua());
        gestante.setAmamentacao(gestanteAtualizada.isAmamentacao());
        gestante.setChefeFamilia(gestanteAtualizada.getChefeFamilia());
        gestante.setDataUltimaGestacao(gestanteAtualizada.getDataUltimaGestacao());
        gestante.setEmRisco(gestanteAtualizada.isEmRisco());
        gestante.setEstadoCivil(gestanteAtualizada.getEstadoCivil());
        gestante.setQuantidadeAbortos(gestanteAtualizada.getQuantidadeAbortos());
        gestante.setQuantidadeFilhosVivos(gestanteAtualizada.getQuantidadeFilhosVivos());
        gestante.setQuantidadeGemelares(gestanteAtualizada.getQuantidadeGemelares());
        gestante.setQuantidadeGestacao(gestanteAtualizada.getQuantidadeGestacao());
        gestante.setQuantidadeNascidosMortos(gestanteAtualizada.getQuantidadeNascidosMortos());
        gestante.setQuantidadeNascidosVivos(gestanteAtualizada.getQuantidadeNascidosVivos());
        gestante.setQuantidadeObitosSemana1(gestanteAtualizada.getQuantidadeObitosSemana1());
        gestante.setQuantidadeObitosAposSemana1(gestanteAtualizada.getQuantidadeObitosAposSemana1());
        gestante.setQuantidadePartos(gestanteAtualizada.getQuantidadePartos());
        gestante.setQuantidadePartosCesarios(gestanteAtualizada.getQuantidadePartosCesarios());
        gestante.setQuantidadePartosVaginais(gestanteAtualizada.getQuantidadePartosVaginais());
        gestante.setQuantidadeRnPeso2500_4000(gestanteAtualizada.getQuantidadeRnPeso2500_4000());
        gestante.setQuantidadeRnPesoMaior4000(gestanteAtualizada.getQuantidadeRnPesoMaior4000());
        gestante.setQuantidadeRnPesoMenor2500(gestanteAtualizada.getQuantidadeRnPesoMenor2500());
        gestante.setHipertensao(gestanteAtualizada.isHipertensao());
        gestante.setDiabetes(gestanteAtualizada.isDiabetes());
        gestante.setCirurgiaPelvica(gestanteAtualizada.isCirurgiaPelvica());
        gestante.setInfeccaoUrinaria(gestanteAtualizada.isInfeccaoUrinaria());
        gestante.setMaFormacaoCongenita(gestanteAtualizada.isMaFormacaoCongenita());
        gestante.setFamiliarGemeos(gestanteAtualizada.isFamiliarGemeos());
        gestante.setContato(gestanteAtualizada.getContato());
        gestante.setContatoEmergencia(gestanteAtualizada.getContatoEmergencia());
        return repositorio.save(gestante);
    }

    public void deletarGestante(String cpf) {
        Gestante gestante = buscarGestantePorCpf(cpf);
        repositorio.delete(gestante);
    }
}
