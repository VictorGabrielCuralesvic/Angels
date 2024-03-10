package com.system.angels.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "DadosEvolutivos")
public class DadosEvolutivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gestante_id", nullable = false)
    private Gestante gestante;

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
    private boolean chefeFamilia;

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
