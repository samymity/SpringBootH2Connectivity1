package com.example.demo.repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

/**
 * But that’s what makes Spring Data JPA so powerful: You don’t have to write an implementation of the repository interface.
 * Spring Data JPA creates an implementation on the fly when you run the application
 * Ref: https://spring.io/guides/gs/accessing-data-jpa/
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    // you may or may not want to have specialized methods
    Book findByName(String name);
}
