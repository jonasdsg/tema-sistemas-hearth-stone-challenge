package br.com.temasistemas.hearthstone.model;

import static java.util.Objects.nonNull;

import br.com.temasistemas.hearthstone.exceptions.FalhaAoConverterEnumeradoObjetoNulo;

public enum Tipo {
    MAGIA, CRIATURA;

    public static Tipo parse(String tipo) {
        if (nonNull(tipo)) {
            return MAGIA.toString().toLowerCase().equals(tipo.toLowerCase())
             ? MAGIA : CRIATURA;
        }
        throw new FalhaAoConverterEnumeradoObjetoNulo("Falha ao converter o enum Tipo");
    }
}
