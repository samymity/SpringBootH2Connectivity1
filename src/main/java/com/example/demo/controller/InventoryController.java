package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.entity.Inventory;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.InventoryRepository;
import com.example.demo.service.implementation.BookService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import javax.validation.constraints.NotNull;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InventoryController {

	private static final Logger log = LoggerFactory.getLogger(InventoryController.class);
	
	 @Autowired 
	private BookService bookService;

	    @Autowired
        InventoryRepository repository;

    @RequestMapping(value = "/Inventory", method = RequestMethod.GET, produces = "application/json")

    public ResponseEntity<Inventory> channels(    @RequestParam(value = "1", required = true)  Integer SiteId) {

        log.info("Sandeep..  "   +  SiteId );


    	 Inventory  inventory =  repository.findBySiteId(SiteId);
      //  25063
       //  System.out.println("Books are " + books.get(0));
    	
        log.info("Sandeep..");
      //  List<Book> channels = bookService.getAllBooks();
        return ResponseEntity.ok(inventory);
    }





}