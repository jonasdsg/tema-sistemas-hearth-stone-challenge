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
    private Atributos atibutos;

    public Carta(Long id, String nome, String descricao, Integer ataque, Integer defesa, Tipo tipo, Classe classe) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.atibutos = new Atributos(ataque, defesa, tipo, classe);
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
        return this.atibutos.getDefesa();
    }

    public Integer getAtaque() {
        return this.atibutos.getAtaque();
    }

    public Tipo getTipo() {
        return this.atibutos.getTipo();
    }

    public Classe getClasse() {
        return this.atibutos.getClasse();
    }
}
