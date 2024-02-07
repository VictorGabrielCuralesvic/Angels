package com.system.angels.dto;

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
}
