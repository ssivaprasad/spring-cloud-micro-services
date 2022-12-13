package com.ssp.apps.library.managemnt.search.books.repository;

import com.ssp.apps.library.managemnt.search.books.entity.Book;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookRepository extends Repository<Book, Long> {

    List<Book> findAll();

    Book findById(Long id);

    List<Book> findByNameContains(String name);
}
