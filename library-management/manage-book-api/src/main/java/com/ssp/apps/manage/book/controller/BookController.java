package com.ssp.apps.manage.book.controller;

import com.ssp.apps.crud.api.common.controller.GenericController;
import com.ssp.apps.manage.book.mapper.BookMapper;
import com.ssp.apps.manage.book.service.BookService;
import com.ssp.apps.manage.book.dto.BookDto;
import com.ssp.apps.manage.book.entity.Book;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookController extends GenericController<Book, Long, BookDto> {
    public BookController(BookService service) {
        super(service, Mappers.getMapper(BookMapper.class));
    }
}
