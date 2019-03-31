package com.example.demo.service.implementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

import java.util.List;

@Component
public class BookService {
    
	@Autowired
	private BookRepository bookRepository;

    // You need to provide the constructor else Spring will have
    // no way to inject your dependency
    // BookRepository is an interface not a bean. So the actual
    // bean will be provided at runtime. See class for more documentation.
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}
