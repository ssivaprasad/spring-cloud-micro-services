package com.ssp.apps.common.todo;

import com.ssp.apps.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface TodoMapper extends GenericMapper<Todo, TodoDto> {
}
