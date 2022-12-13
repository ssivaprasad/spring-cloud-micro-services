package com.ssp.apps.crud.api.todo;

import com.ssp.apps.crud.api.common.controller.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mapstruct.factory.Mappers;


@RestController
@RequestMapping("/todos")
public class TodoController extends GenericController<Todo, Long, TodoDto> {
    public TodoController(TodoService service) {
        super(service, Mappers.getMapper(TodoMapper.class));
    }
}
