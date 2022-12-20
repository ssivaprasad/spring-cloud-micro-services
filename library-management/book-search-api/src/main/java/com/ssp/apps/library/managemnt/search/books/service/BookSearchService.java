package com.ssp.apps.library.managemnt.search.books.service;

import com.netflix.discovery.converters.Auto;
import com.ssp.apps.library.managemnt.search.books.entity.Book;
import com.ssp.apps.library.managemnt.search.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookSearchService {
    @Autowired
    private BookRepository bookRepository;

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAll(String bookName) {
        List<Book> books = new ArrayList<>();
        if (StringUtils.hasText(bookName)) {
            books = bookRepository.findByNameContains(bookName);
        } else {
            books = bookRepository.findAll();
        }
        return books;
    }
}
