package com.system.angels.dto;

import com.system.angels.domain.Gestante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GestanteCadastroDTO {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private int raca;
    private String sexo;
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
    private int quantidadeGemelares;
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

    public GestanteCadastroDTO(Gestante gestante) {
        this.nome = gestante.getNome();
        this.dataNascimento = gestante.getDataNascimento();
        this.cpf = gestante.getCpf();
        this.raca = gestante.getRaca();
        this.sexo = gestante.getSexo();
        this.municipio = gestante.getMunicipio();
        this.diagnosticoDesnutricao = gestante.getDiagnosticoDesnutricao();
        this.energiaEletricaDomicilio = gestante.isEnergiaEletricaDomicilio();
        this.escolaridade = gestante.getEscolaridade();
        this.tipoMoradia = gestante.getTipoMoradia();
        this.moradiaRedeEsgoto = gestante.isMoradiaRedeEsgoto();
        this.rendaFamiliar = gestante.getRendaFamiliar();
        this.tratamentoAgua = gestante.isTratamentoAgua();
        this.amamentacao = gestante.isAmamentacao();
        this.chefeFamilia = gestante.getChefeFamilia();
        this.dataUltimaGestacao = gestante.getDataUltimaGestacao();
        this.emRisco = gestante.isEmRisco();
        this.estadoCivil = gestante.getEstadoCivil();
        this.quantidadeAbortos = gestante.getQuantidadeAbortos();
        this.quantidadeFilhosVivos = gestante.getQuantidadeFilhosVivos();
        this.quantidadeGemelares = gestante.getQuantidadeGemelares();
        this.quantidadeGestacao = gestante.getQuantidadeGestacao();
        this.quantidadeNascidosMortos = gestante.getQuantidadeNascidosMortos();
        this.quantidadeNascidosVivos = gestante.getQuantidadeNascidosVivos();
        this.quantidadeObitosSemana1 = gestante.getQuantidadeObitosSemana1();
        this.quantidadeObitosAposSemana1 = gestante.getQuantidadeObitosAposSemana1();
        this.quantidadePartos = gestante.getQuantidadePartos();
        this.quantidadePartosCesarios = gestante.getQuantidadePartosCesarios();
        this.quantidadePartosVaginais = gestante.getQuantidadePartosVaginais();
        this.quantidadeRnPeso2500_4000 = gestante.getQuantidadeRnPeso2500_4000();
        this.quantidadeRnPesoMaior4000 = gestante.getQuantidadeRnPesoMaior4000();
        this.quantidadeRnPesoMenor2500 = gestante.getQuantidadeRnPesoMenor2500();
        this.hipertensao = gestante.isHipertensao();
        this.diabetes = gestante.isDiabetes();
        this.cirurgiaPelvica = gestante.isCirurgiaPelvica();
        this.infeccaoUrinaria = gestante.isInfeccaoUrinaria();
        this.maFormacaoCongenita = gestante.isMaFormacaoCongenita();
        this.familiarGemeos = gestante.isFamiliarGemeos();
        this.contato = gestante.getContato();
        this.contatoEmergencia = gestante.getContatoEmergencia();
    }
}
