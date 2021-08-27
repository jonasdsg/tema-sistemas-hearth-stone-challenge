package br.com.temasistemas.hearthstone.model;

import static java.util.Arrays.asList;
import static java.util.Objects.nonNull;

import java.util.Optional;

import br.com.temasistemas.hearthstone.exceptions.FalhaAoConverterEnumeradoObjetoNulo;

public enum Classe {
    MAGO, PALADINO, CACADOR, DRUIDA, QUALQUER;

    public static Classe parse(String classe) {
        Optional<Classe> op = asList(MAGO, PALADINO, CACADOR, DRUIDA, QUALQUER).stream()
                .filter(c -> c.toString().toLowerCase().equals(classe)).findFirst();
        if (nonNull(op.get())) {
            return op.get();
        }
        throw new FalhaAoConverterEnumeradoObjetoNulo("O enum Classe não pode ser nulo!");
    }
}
