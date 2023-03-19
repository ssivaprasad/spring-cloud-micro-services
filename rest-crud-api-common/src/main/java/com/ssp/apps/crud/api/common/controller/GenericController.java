package com.ssp.apps.crud.api.common.controller;

import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import com.ssp.apps.crud.api.common.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes"})
@RequiredArgsConstructor
public class GenericController<E, I, D> {
    private final GenericService<E, I> service;
    private final GenericMapper<E, D> mapper;

    @GetMapping("/{id}")
    public D findById(@PathVariable I id) {
        E entity = service.findById(id);
        return mapper.toModel(entity);
    }

    @GetMapping("/all")
    public ResponseEntity<List<D>> findAll() {
        List<E> data = service.findAll();

        if (CollectionUtils.isEmpty(data)) {
            return new ResponseEntity(new ArrayList(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(mapper.toModelList(data), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Page<D>> findAll(@RequestParam(name = "pageNo", defaultValue = "0") Integer pageNo,
                                           @RequestParam(name = "pageSize", defaultValue = "50") Integer pageSize) {
        Page<E> pageable = service.findAll(pageNo, pageSize);

        if (pageable.getContent().isEmpty()) {
            return new ResponseEntity(new ArrayList(), HttpStatus.NO_CONTENT);
        }
        Page<D> page = new PageImpl<>(mapper.toModelList(pageable.getContent()), PageRequest.of(pageNo, pageSize), pageable.getTotalElements());
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@RequestBody D request, I id) {
        E entity = service.update(mapper.toEntity(request), id);
        return new ResponseEntity<D>(mapper.toModel(entity), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody D request) {
        E entity = service.save(mapper.toEntity(request));
        return new ResponseEntity<D>(mapper.toModel(entity), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable I id) {
        service.delete(id);
    }

}
