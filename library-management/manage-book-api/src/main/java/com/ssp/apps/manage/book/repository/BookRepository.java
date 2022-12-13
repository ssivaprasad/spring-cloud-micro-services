package com.ssp.apps.manage.book.repository;

import com.ssp.apps.manage.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
