package com.ssp.apps.crud.api.todo;

import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class TodoService extends GenericService<Todo, Long> {
    public TodoService(TodoRepository repository) {
        super(repository);
    }
}
