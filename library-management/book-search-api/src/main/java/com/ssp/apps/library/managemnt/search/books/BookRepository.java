package com.ssp.apps.library.managemnt.search.books;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookRepository extends Repository<Book, Long> {

    List<Book> findAll();

    Book findById(Long id);

    List<Book> findByNameContains(String name);
}
