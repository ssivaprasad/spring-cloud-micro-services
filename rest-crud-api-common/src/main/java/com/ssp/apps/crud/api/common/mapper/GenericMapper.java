package com.ssp.apps.crud.api.common.mapper;

import java.util.List;

public interface GenericMapper<E, D> {
    E toEntity(D dto);

    D toModel(E entity);

    List<E> toEntityList(List<D> dtoList);

    List<D> toModelList(List<E> entityList);

}