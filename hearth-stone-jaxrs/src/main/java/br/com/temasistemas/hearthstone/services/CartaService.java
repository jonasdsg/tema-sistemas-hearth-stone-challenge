package br.com.temasistemas.hearthstone.services;

import java.util.List;

import javax.validation.Valid;

import br.com.temasistemas.hearthstone.dtos.CartaDTO;
import br.com.temasistemas.hearthstone.mappers.CartaMapper;
import br.com.temasistemas.hearthstone.model.Classe;
import br.com.temasistemas.hearthstone.model.Tipo;
import br.com.temasistemas.hearthstone.repositories.CartaDAO;

public class CartaService {
	private CartaDAO cartaDAO;
	private CartaMapper cartaMapper;

	public CartaService() {
		this.cartaDAO = new CartaDAO();
		this.cartaMapper = new CartaMapper();
	}

	public List<CartaDTO> procurarPorParametros(Long id, String nome, String descricao, Integer ataque, Integer defesa,
			String tipo, String classe) {
		return cartaMapper.toListDTO(cartaDAO.findCardsUsingParameters(id, nome, descricao, ataque, defesa,
				Tipo.parse(tipo), Classe.parse(classe)));
	}

	public CartaDTO salvar(CartaDTO carta) {
		return cartaMapper.toDTO(cartaDAO.save(cartaMapper.toModel(carta)));
	}

	public void delete(Long id) {
		cartaDAO.deleteById(id);
	}

	public CartaDTO procurarPorId(Long id) {
		return cartaMapper.toDTO(cartaDAO.findById(id));
	}

	public CartaDTO atualizar(CartaDTO carta) {
		return cartaMapper.toDTO(cartaDAO.atualizar(cartaMapper.toModel(carta)));
	}

}
