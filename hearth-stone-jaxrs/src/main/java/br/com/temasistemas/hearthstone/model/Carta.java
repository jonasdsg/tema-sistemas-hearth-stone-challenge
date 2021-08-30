package br.com.temasistemas.hearthstone.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carta {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Embedded
    private Atributos atributos;

    @Deprecated
    public Carta(){} //Construtor JPA
    public Carta(Long id, String nome, String descricao, Integer ataque, Integer defesa, Tipo tipo, Classe classe) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.atributos = new Atributos(ataque, defesa, tipo, classe);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getDefesa() {
        return this.atributos.getDefesa();
    }

    public Integer getAtaque() {
        return this.atributos.getAtaque();
    }

    public Tipo getTipo() {
        return this.atributos.getTipo();
    }

    public Classe getClasse() {
        return this.atributos.getClasse();
    }
}
