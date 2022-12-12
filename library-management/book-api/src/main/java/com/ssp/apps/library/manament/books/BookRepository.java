package com.ssp.apps.library.manament.books;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends CrudRepository<Book, Long> {

}
