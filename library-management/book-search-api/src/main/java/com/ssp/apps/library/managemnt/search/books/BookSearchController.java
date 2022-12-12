package com.ssp.apps.library.managemnt.search.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book-search")
public class BookSearchController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    @GetMapping
    public List<Book> findAll(@RequestParam(name = "name", required = false) String name) {
        List<Book> books = new ArrayList<>();
        if (StringUtils.hasText(name)) {
            books = bookRepository.findByNameContains(name);
        } else {
            books = bookRepository.findAll();
        }
        return books;
    }
}
