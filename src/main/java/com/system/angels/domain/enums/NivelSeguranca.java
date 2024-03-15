package com.system.angels.domain.enums;

public enum NivelSeguranca {
    SEGURANCA(0),
    INSEGURANCA_LEVE_COM_MENOR(1),
    INSEGURANCA_MODERADA_COM_MENOR(2),
    INSEGURANCA_GRAVE_COM_MENOR(3),
    INSEGURANCA_LEVE_SEM_MENOR(4),
    INSEGURANCA_MODERADA_SEM_MENOR(5),
    INSEGURANCA_GRAVE_SEM_MENOR(6);

    NivelSeguranca(final int codigo) {
    }
}
