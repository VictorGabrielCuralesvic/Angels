package com.system.angels.dto;

import com.system.angels.domain.DadosAtivos;
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
public class CadastrarDadosAtivosDTO {

    private Gestante gestante_id;
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

    public CadastrarDadosAtivosDTO(DadosAtivos dadosAtivos) {
        this.gestante_id = dadosAtivos.getGestante_id();
        this.municipio = dadosAtivos.getMunicipio();
        this.diagnosticoDesnutricao = dadosAtivos.getDiagnosticoDesnutricao();
        this.energiaEletricaDomicilio = dadosAtivos.isEnergiaEletricaDomicilio();
        this.escolaridade = dadosAtivos.getEscolaridade();
        this.tipoMoradia = dadosAtivos.getTipoMoradia();
        this.moradiaRedeEsgoto = dadosAtivos.isMoradiaRedeEsgoto();
        this.rendaFamiliar = dadosAtivos.getRendaFamiliar();
        this.tratamentoAgua = dadosAtivos.isTratamentoAgua();
        this.amamentacao = dadosAtivos.isAmamentacao();
        this.chefeFamilia = dadosAtivos.getChefeFamilia();
        this.dataUltimaGestacao = dadosAtivos.getDataUltimaGestacao();
        this.emRisco = dadosAtivos.isEmRisco();
        this.estadoCivil = dadosAtivos.getEstadoCivil();
        this.quantidadeAbortos = dadosAtivos.getQuantidadeAbortos();
        this.quantidadeFilhosVivos = dadosAtivos.getQuantidadeFilhosVivos();
        this.quantidadeGestacao = dadosAtivos.getQuantidadeGestacao();
        this.quantidadeNascidosMortos = dadosAtivos.getQuantidadeNascidosMortos();
        this.quantidadeNascidosVivos = dadosAtivos.getQuantidadeNascidosVivos();
        this.quantidadeObitosSemana1 = dadosAtivos.getQuantidadeObitosSemana1();
        this.quantidadeObitosAposSemana1 = dadosAtivos.getQuantidadeObitosAposSemana1();
        this.quantidadePartos = dadosAtivos.getQuantidadePartos();
        this.quantidadePartosCesarios = dadosAtivos.getQuantidadePartosCesarios();
        this.quantidadePartosVaginais = dadosAtivos.getQuantidadePartosVaginais();
        this.quantidadeRnPeso2500_4000 = dadosAtivos.getQuantidadeRnPeso2500_4000();
        this.quantidadeRnPesoMaior4000 = dadosAtivos.getQuantidadeRnPesoMaior4000();
        this.quantidadeRnPesoMenor2500 = dadosAtivos.getQuantidadeRnPesoMenor2500();
        this.hipertensao = dadosAtivos.isHipertensao();
        this.diabetes = dadosAtivos.isDiabetes();
        this.cirurgiaPelvica = dadosAtivos.isCirurgiaPelvica();
        this.infeccaoUrinaria = dadosAtivos.isInfeccaoUrinaria();
        this.maFormacaoCongenita = dadosAtivos.isMaFormacaoCongenita();
        this.familiarGemeos = dadosAtivos.isFamiliarGemeos();
        this.contato = dadosAtivos.getContato();
        this.contatoEmergencia = dadosAtivos.getContatoEmergencia();
    }

}
