package br.com.temasistemas.hearthstone.mappers;

import java.util.List;

public interface Mapper<D, M> {
    D toDTO(M model);

    M toModel(D dto);

    List<D> toListDTO(List<M> models);

    List<M> toListModel(List<D> dtos);
}
