package com.ssp.apps.manage.book;

import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper extends GenericMapper<Book, BookDto> {
}
