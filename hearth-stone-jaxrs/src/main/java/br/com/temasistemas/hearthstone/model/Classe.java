package br.com.temasistemas.hearthstone.model;

import static java.util.Arrays.asList;
import static java.util.Objects.nonNull;

import java.util.Optional;

import br.com.temasistemas.hearthstone.exceptions.FalhaAoConverterEnumeradoObjetoNulo;

public enum Classe {
    MAGO, PALADINO, CACADOR, DRUIDA, QUALQUER;

    public static Classe parse(String classe) {
        if (nonNull(classe)) {
            try {
                Optional<Classe> op = asList(MAGO, PALADINO, CACADOR, DRUIDA, QUALQUER).stream()
                        .filter(c -> c.toString().toLowerCase().equals(classe.toLowerCase())).findFirst();
                return op.get();
            } 
            catch (Exception e) {
                throw new FalhaAoConverterEnumeradoObjetoNulo("O enum Classe não pode ser nulo!");
            }
        }
        return null;
    }
}
