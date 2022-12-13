package com.ssp.apps.manage.book;

import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BookService extends GenericService<Book, Long> {
    public BookService(BookRepository repository) {
        super(repository);
    }
}
