package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.FisFuelOutageBO;


public interface OutageService {

	
	 List<FisFuelOutageBO> findAll();
	 FisFuelOutageBO findBysNo (Integer id);
}

