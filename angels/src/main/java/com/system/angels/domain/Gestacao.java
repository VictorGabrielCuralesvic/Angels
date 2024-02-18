package com.system.angels.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "Gestacao")
public class Gestacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gestante_id", nullable = false)
    private Gestante gestante;

    @Column(nullable = false)
    private boolean consumoAlcool;

    @Column(nullable = false)
    private int frequenciaUsoAlcool;

    @Column(nullable = false)
    private Date dataUltimaMenstruacao;

    @Column(nullable = false)
    private Date dataInicioGestacao;

    @Column(nullable = false)
    private String fatorRh;

    @Column(nullable = false)
    private boolean fuma;

    @Column(nullable = false)
    private int quantidadeCigarrosDia;

    @Column(nullable = false)
    private int usoDrogas;

    @Column(nullable = false)
    private boolean gravidezPlanejada;

    @Column(nullable = false)
    private int grupoSanguineo;

    @Column(nullable = false)
    private BigDecimal pesoAntesGestacao;

    @Column(nullable = false)
    private int riscoGestacional;

    @Column(nullable = false)
    private boolean vacinaHepatiteB;

    @Column(nullable = false)
    private int situacaoGestacional;
}
