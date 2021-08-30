package br.com.temasistemas.hearthstone.model;

import static javax.persistence.EnumType.STRING;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Embeddable
public class Atributos {
    private Integer ataque;
    private Integer defesa;
    @Enumerated(STRING)
    private Tipo tipo;
    @Enumerated(STRING)
    private Classe classe;

    @Deprecated
    public Atributos(){} //Construtor JPA
    public Atributos(Integer ataque, Integer defesa, Tipo tipo, Classe classe) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
        this.classe = classe;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Classe getClasse() {
        return classe;
    }
}
