package com.ssp.apps.crud.api.common.service;

import com.ssp.apps.crud.api.common.exception.EmptyDataFoundException;
import com.ssp.apps.crud.api.common.exception.NoRecordFoundException;
import com.ssp.apps.crud.api.common.exception.RecordDoesNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

@Slf4j
public abstract class GenericService<E, I> {

    private JpaRepository<E, I> repository;
    private Class<E> entityClassType;

    public GenericService(JpaRepository<E, I> repository) {
        this.repository = repository;
        entityClassType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public E findById(I id) {
        return repository.findById(id).orElseThrow(() -> {
            String errorMessage = String.format("No Record found for the given Id: %s, type: %s", id, entityClassType);
            return new NoRecordFoundException(errorMessage + id);
        });
    }

    public Page<E> findAll(Integer pageNumber, Integer size) {
        pageNumber = pageNumber != null ? pageNumber : 0;
        size = size != null ? size : 10;

        Pageable page = PageRequest.of(pageNumber, size);
        Page<E> data = repository.findAll(page);

        if (CollectionUtils.isEmpty(data.getContent())) {
            throw new EmptyDataFoundException("No Data found");
        }
        return data;
    }

    public E save(E entity) {
        if (entity == null) {
            throw new IllegalArgumentException(String.format("Object Cannot be null: %s", entityClassType));
        }
        return repository.save(entity);
    }

    public E update(E entity, I id) {
        if (entity == null) {
            throw new IllegalArgumentException(String.format("Object Cannot be null: %s", entityClassType));
        }

        if (isExist(id).isPresent()) {
            return repository.save(entity);
        } else {
            throw new RecordDoesNotExistException("Can not update record which does not exist");
        }
    }

    public void delete(I id) {
        if (isExist(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new RecordDoesNotExistException("Can not delete record which does not exist");
        }
    }

    public Optional<E> isExist(I id) {
        return repository.findById(id);
    }

}