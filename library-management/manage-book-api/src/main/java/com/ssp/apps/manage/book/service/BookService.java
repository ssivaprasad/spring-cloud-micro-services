package com.ssp.apps.manage.book.service;

import com.ssp.apps.crud.api.common.service.GenericService;
import com.ssp.apps.manage.book.entity.Book;
import com.ssp.apps.manage.book.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService extends GenericService<Book, Long> {
    public BookService(BookRepository repository) {
        super(repository);
    }
}
