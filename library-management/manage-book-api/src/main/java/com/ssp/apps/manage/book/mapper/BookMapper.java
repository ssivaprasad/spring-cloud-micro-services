package com.ssp.apps.manage.book.mapper;

import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import com.ssp.apps.manage.book.dto.BookDto;
import com.ssp.apps.manage.book.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper extends GenericMapper<Book, BookDto> {
}
