package com.system.angels.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Exame")
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "acompanhamento_id", nullable = false)
    private Acompanhamento acompanhamento;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String resultado;

    @Column
    private String observacao;
}
