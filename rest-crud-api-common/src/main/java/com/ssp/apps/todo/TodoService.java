package com.ssp.apps.todo;

import com.ssp.apps.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class TodoService extends GenericService<Todo, Long> {
    public TodoService(TodoRepository repository) {
        super(repository);
    }
}
