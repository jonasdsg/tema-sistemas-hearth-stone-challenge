package br.com.temasistemas.hearthstone.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.temasistemas.hearthstone.model.Carta;
import br.com.temasistemas.hearthstone.model.Classe;
import br.com.temasistemas.hearthstone.model.Tipo;

@Repository
public interface CartaRepository extends CrudRepository<Carta,Long>{

    @Query("SELECT c FROM Carta c WHERE "
        +"(:id is null OR c.id = :id) AND "
        +"(:nome is null OR c.nome LIKE %:nome%) AND "
        +"(:descricao is null OR c.descricao LIKE %:descricao%) AND "
        +"(:ataque is null OR c.atributos.ataque = :ataque) AND "
        +"(:defesa is null OR c.atributos.defesa = :defesa) AND "
        +"(:tipo is null OR c.atributos.tipo = :tipo) AND "
        +"(:classe is null OR c.atributos.classe = :classe)")
    public List<Carta> findCardsUsingParameters(Long id, String nome, String descricao, Integer ataque, Integer defesa,
            Tipo tipo, Classe classe);
    
}
