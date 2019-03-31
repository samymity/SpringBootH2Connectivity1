package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FisFuelOutageBO;

@Repository
public interface OutageRepository extends JpaRepository<FisFuelOutageBO, Integer> {

	
	FisFuelOutageBO findBysNo (Integer sNo);

	    @Override
	    List<FisFuelOutageBO> findAll();

	
	
}
