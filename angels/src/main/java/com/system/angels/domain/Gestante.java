package com.system.angels.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Gestante")
public class Gestante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private int raca;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private String municipio;

    @Column(nullable = false)
    private int diagnosticoDesnutricao;

    @Column(nullable = false)
    private boolean energiaEletricaDomicilio;

    @Column(nullable = false)
    private int escolaridade;

    @Column(nullable = false)
    private int tipoMoradia;

    @Column(nullable = false)
    private boolean moradiaRedeEsgoto;

    @Column(nullable = false)
    private BigDecimal rendaFamiliar;

    @Column(nullable = false)
    private boolean tratamentoAgua;

    @Column(nullable = false)
    private boolean amamentacao;

    @Column(nullable = false)
    private String chefeFamilia;

    @Column
    private Date dataUltimaGestacao;

    @Column(nullable = false)
    private boolean emRisco;

    @Column(nullable = false)
    private int estadoCivil;

    @Column(nullable = false)
    private int quantidadeAbortos;

    @Column(nullable = false)
    private int quantidadeFilhosVivos;

    @Column(nullable = false)
    private int quantidadeGemelares;

    @Column(nullable = false)
    private int quantidadeGestacao;

    @Column(nullable = false)
    private int quantidadeNascidosMortos;

    @Column(nullable = false)
    private int quantidadeNascidosVivos;

    @Column(nullable = false)
    private int quantidadeObitosSemana1;

    @Column(nullable = false)
    private int quantidadeObitosAposSemana1;

    @Column(nullable = false)
    private int quantidadePartos;

    @Column(nullable = false)
    private int quantidadePartosCesarios;

    @Column(nullable = false)
    private int quantidadePartosVaginais;

    @Column(nullable = false)
    private int quantidadeRnPeso2500_4000;

    @Column(nullable = false)
    private int quantidadeRnPesoMaior4000;

    @Column(nullable = false)
    private int quantidadeRnPesoMenor2500;

    @Column(nullable = false)
    private boolean hipertensao;

    @Column(nullable = false)
    private boolean diabetes;

    @Column(nullable = false)
    private boolean cirurgiaPelvica;

    @Column(nullable = false)
    private boolean infeccaoUrinaria;

    @Column(nullable = false)
    private boolean maFormacaoCongenita;

    @Column(nullable = false)
    private boolean familiarGemeos;

    @Column(nullable = false)
    private String contato;

    @Column(nullable = false)
    private String contatoEmergencia;
}
