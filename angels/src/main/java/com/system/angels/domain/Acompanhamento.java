package com.system.angels.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Acompanhamento")
public class Acompanhamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gestante_id", nullable = false)
    private Gestante gestante;

    @Column(nullable = false)
    private Date dataAcompanhamento;

    @Column(nullable = false)
    private String realizadoPor;

    @Column(nullable = false)
    private BigDecimal pesoAtual;

    @Column(nullable = false)
    private int idadeGestacional;

    @Column(nullable = false)
    private String pressaoArterial;

    @Column
    private Integer batimentosCardiacosFeto;

    @Column
    private Integer alturaUterina;

    @Column(nullable = false)
    private String tipo;
}