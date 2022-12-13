package com.ssp.apps.crud.api.todo;

import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface TodoMapper extends GenericMapper<Todo, TodoDto> {
}
