package com.example.demo.controller;



import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.FisFuelOutageBO;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.OutageRepository;
import com.example.demo.service.OutageService;


import lombok.experimental.NonFinal;

@RestController
public class OutageController2 {

	@Autowired
	  OutageService outageService;


    @Autowired
    OutageRepository  outagerepository;

    @RequestMapping("/Outage1")
    public ResponseEntity<List<FisFuelOutageBO>> channels() {
    	
    	
    	List<FisFuelOutageBO> channels = (List<FisFuelOutageBO>) outagerepository.findAll();

    	
    //    List<FisFuelOutageBO> channels = outageService.findAll();
        
        
        
        return ResponseEntity.ok(channels);
    }





}