package br.com.temasistemas.hearthstone.repositories;

import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.temasistemas.hearthstone.model.Carta;
import br.com.temasistemas.hearthstone.model.Classe;
import br.com.temasistemas.hearthstone.model.Tipo;

public class CartaDAO {
	private EntityManager em;

	public CartaDAO() {
		em = Persistence.createEntityManagerFactory("hearthStone").createEntityManager();
	}

	public Carta findById(Long id) {
		return em.find(Carta.class, id);
	}
	
	public Carta save(Carta carta) {
		em.getTransaction().begin();
		em.persist(carta);
		em.getTransaction().commit();
		return carta;
	}
	
	public void deleteById(Long id) {
		Carta carta = this.findById(id);
		em.getTransaction().begin();
		em.remove(carta);
		em.getTransaction().commit();
	}
	
	public Carta atualizar(Carta carta) {
		return em.merge(carta);
	}
	
	public List<Carta> findCardsUsingParameters(Long id, String nome, String descricao, Integer ataque, Integer defesa,
			Tipo tipo, Classe classe) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Carta> criteriaQuery = criteriaBuilder.createQuery(Carta.class);
		Root<Carta> root = criteriaQuery.from(Carta.class);
		List<Predicate> predicates = new ArrayList<Predicate>();
		if(nonNull(id)) {
			predicates.add(criteriaBuilder.equal(root.get("id"),id));
		}
		if(nonNull(nome)) {
			predicates.add(criteriaBuilder.like(root.get("nome"), nome));
		}
		if(nonNull(descricao)) {
			predicates.add(criteriaBuilder.like(root.get("descricao"), descricao));
		}
		if(nonNull(ataque)) {
			predicates.add(criteriaBuilder.equal(root.get("atributos").get("ataque"), ataque));
		}
		if(nonNull(defesa)) {
			predicates.add(criteriaBuilder.equal(root.get("atributos").get("defesa"), defesa));
		}
		if(nonNull(tipo)) {
			predicates.add(criteriaBuilder.equal(root.get("atributos").get("tipo"), tipo));
		}
		if(nonNull(classe)) {
			predicates.add(criteriaBuilder.equal(root.get("atributos").get("classe"), classe));
		}
		CriteriaQuery<Carta> query = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
		
		return em.createQuery(query).getResultList();
	}
	
}
