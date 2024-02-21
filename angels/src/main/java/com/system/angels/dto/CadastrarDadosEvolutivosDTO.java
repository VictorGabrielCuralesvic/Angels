package com.system.angels.dto;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastrarDadosEvolutivosDTO {

    private Gestante gestante;
    private String municipio;
    private int diagnosticoDesnutricao;
    private boolean energiaEletricaDomicilio;
    private int escolaridade;
    private int tipoMoradia;
    private boolean moradiaRedeEsgoto;
    private BigDecimal rendaFamiliar;
    private boolean tratamentoAgua;
    private boolean amamentacao;
    private String chefeFamilia;
    private Date dataUltimaGestacao;
    private boolean emRisco;
    private int estadoCivil;
    private int quantidadeAbortos;
    private int quantidadeFilhosVivos;
    private int quantidadeGestacao;
    private int quantidadeNascidosMortos;
    private int quantidadeNascidosVivos;
    private int quantidadeObitosSemana1;
    private int quantidadeObitosAposSemana1;
    private int quantidadePartos;
    private int quantidadePartosCesarios;
    private int quantidadePartosVaginais;
    private int quantidadeRnPeso2500_4000;
    private int quantidadeRnPesoMaior4000;
    private int quantidadeRnPesoMenor2500;
    private boolean hipertensao;
    private boolean diabetes;
    private boolean cirurgiaPelvica;
    private boolean infeccaoUrinaria;
    private boolean maFormacaoCongenita;
    private boolean familiarGemeos;
    private String contato;
    private String contatoEmergencia;

    public CadastrarDadosEvolutivosDTO(DadosEvolutivos dadosEvolutivos) {
        this.gestante = dadosEvolutivos.getGestante();
        this.municipio = dadosEvolutivos.getMunicipio();
        this.diagnosticoDesnutricao = dadosEvolutivos.getDiagnosticoDesnutricao();
        this.energiaEletricaDomicilio = dadosEvolutivos.isEnergiaEletricaDomicilio();
        this.escolaridade = dadosEvolutivos.getEscolaridade();
        this.tipoMoradia = dadosEvolutivos.getTipoMoradia();
        this.moradiaRedeEsgoto = dadosEvolutivos.isMoradiaRedeEsgoto();
        this.rendaFamiliar = dadosEvolutivos.getRendaFamiliar();
        this.tratamentoAgua = dadosEvolutivos.isTratamentoAgua();
        this.amamentacao = dadosEvolutivos.isAmamentacao();
        this.chefeFamilia = dadosEvolutivos.getChefeFamilia();
        this.dataUltimaGestacao = dadosEvolutivos.getDataUltimaGestacao();
        this.emRisco = dadosEvolutivos.isEmRisco();
        this.estadoCivil = dadosEvolutivos.getEstadoCivil();
        this.quantidadeAbortos = dadosEvolutivos.getQuantidadeAbortos();
        this.quantidadeFilhosVivos = dadosEvolutivos.getQuantidadeFilhosVivos();
        this.quantidadeGestacao = dadosEvolutivos.getQuantidadeGestacao();
        this.quantidadeNascidosMortos = dadosEvolutivos.getQuantidadeNascidosMortos();
        this.quantidadeNascidosVivos = dadosEvolutivos.getQuantidadeNascidosVivos();
        this.quantidadeObitosSemana1 = dadosEvolutivos.getQuantidadeObitosSemana1();
        this.quantidadeObitosAposSemana1 = dadosEvolutivos.getQuantidadeObitosAposSemana1();
        this.quantidadePartos = dadosEvolutivos.getQuantidadePartos();
        this.quantidadePartosCesarios = dadosEvolutivos.getQuantidadePartosCesarios();
        this.quantidadePartosVaginais = dadosEvolutivos.getQuantidadePartosVaginais();
        this.quantidadeRnPeso2500_4000 = dadosEvolutivos.getQuantidadeRnPeso2500_4000();
        this.quantidadeRnPesoMaior4000 = dadosEvolutivos.getQuantidadeRnPesoMaior4000();
        this.quantidadeRnPesoMenor2500 = dadosEvolutivos.getQuantidadeRnPesoMenor2500();
        this.hipertensao = dadosEvolutivos.isHipertensao();
        this.diabetes = dadosEvolutivos.isDiabetes();
        this.cirurgiaPelvica = dadosEvolutivos.isCirurgiaPelvica();
        this.infeccaoUrinaria = dadosEvolutivos.isInfeccaoUrinaria();
        this.maFormacaoCongenita = dadosEvolutivos.isMaFormacaoCongenita();
        this.familiarGemeos = dadosEvolutivos.isFamiliarGemeos();
        this.contato = dadosEvolutivos.getContato();
        this.contatoEmergencia = dadosEvolutivos.getContatoEmergencia();
    }

}
