package br.com.temasistemas.hearthstone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.temasistemas.hearthstone.dtos.CartaDTO;
import br.com.temasistemas.hearthstone.mappers.CartaMapper;
import br.com.temasistemas.hearthstone.model.Classe;
import br.com.temasistemas.hearthstone.model.Tipo;
import br.com.temasistemas.hearthstone.repositories.CartaRepository;

@Service
public class CartaService {
    private CartaRepository cartaRepository;
    private CartaMapper cartaMapper;

    @Autowired
    public CartaService(CartaRepository cartaRepository, CartaMapper cartaMapper) {
        this.cartaRepository = cartaRepository;
        this.cartaMapper = cartaMapper;
    }

    public List<CartaDTO> procurarPorParametros(Long id, String nome, String descricao, Integer ataque, Integer defesa,
            String tipo, String classe) {
        return cartaMapper.toListDTO(cartaRepository.findCardsUsingParameters(id,nome,descricao,ataque,defesa,Tipo.parse(tipo), Classe.parse(classe)));
    }

}
