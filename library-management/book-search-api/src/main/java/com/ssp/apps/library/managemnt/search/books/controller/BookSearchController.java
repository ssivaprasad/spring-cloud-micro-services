package com.ssp.apps.library.managemnt.search.books.controller;

import com.ssp.apps.library.managemnt.search.books.dto.BookSearchDto;
import com.ssp.apps.library.managemnt.search.books.entity.Book;
import com.ssp.apps.library.managemnt.search.books.service.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookSearchController {
    @Autowired
    private BookSearchService bookSearchService;

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookSearchService.findById(id);
    }

    @GetMapping
    public List<BookSearchDto> findAll(@RequestParam(name = "name", required = false) String name) {
        return bookSearchService.findAll(name)
                .stream()
                .map(book -> new BookSearchDto(book.getId(), book.getName()))
                .collect(Collectors.toList());
    }
}
