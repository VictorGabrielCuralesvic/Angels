package com.system.angels.dto.create;

import com.system.angels.domain.Gestante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastrarGestanteDTO {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private int raca;
    private String sexo;

    public CadastrarGestanteDTO(Gestante gestante) {
        this.nome = gestante.getNome();
        this.dataNascimento = gestante.getDataNascimento();
        this.cpf = gestante.getCpf();
        this.raca = gestante.getRaca();
        this.sexo = gestante.getSexo();
    }
}