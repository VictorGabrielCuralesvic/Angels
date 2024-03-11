package com.system.angels.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="AcompanhamentoIA")
public class AcompanhamentoIA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "acompanhamento_id", nullable = false)
    private Acompanhamento acompanhamento;

    @Column
    private String nomeModelo;

    @Column
    private Float probabilidade;

}
