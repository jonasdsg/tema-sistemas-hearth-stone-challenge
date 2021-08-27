package br.com.temasistemas.hearthstone.mappers;

import static java.util.stream.Collectors.toList;

import java.util.List;

import br.com.temasistemas.hearthstone.dtos.CartaDTO;
import br.com.temasistemas.hearthstone.exceptions.FalhaAoMapearObjeto;
import br.com.temasistemas.hearthstone.model.Carta;
import br.com.temasistemas.hearthstone.model.Classe;
import br.com.temasistemas.hearthstone.model.Tipo;

public class CartaMapper implements Mapper<CartaDTO, Carta> {

    @Override
    public CartaDTO toDTO(Carta model) {
        CartaDTO dto = new CartaDTO();
        try {
            dto.id = model.getId();
            dto.nome = model.getNome();
            dto.ataque = model.getAtaque();
            dto.defesa = model.getDefesa();
            dto.descricao = model.getDescricao();
            dto.classe = model.getClasse().toString();
            dto.tipo = model.getTipo().toString();

            return dto;
        } 
        catch (Exception e) {
            throw new FalhaAoMapearObjeto(e);
        }

    }

    @Override
    public Carta toModel(CartaDTO dto) {
        try {
            return new Carta(dto.id, dto.nome, dto.descricao, dto.ataque, dto.defesa, Tipo.parse(dto.tipo),
                    Classe.parse(dto.classe));
        } 
        catch (Exception e) {
            throw new FalhaAoMapearObjeto(e);
        }
    }

    @Override
    public List<CartaDTO> toListDTO(List<Carta> models) {
        try {
            return models.stream().map(this::toDTO).collect(toList());
        } 
        catch (Exception e) {
            throw new FalhaAoMapearObjeto(e);
        }
    }

    @Override
    public List<Carta> toListModel(List<CartaDTO> dtos) {
        try {
            return dtos.stream().map(this::toModel).collect(toList());
        } 
        catch (Exception e) {
            throw new FalhaAoMapearObjeto(e);
        }
    }

}
