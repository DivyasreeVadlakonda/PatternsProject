package com.springsample.DMS.repository;

import java.util.List;

import com.springsample.DMS.Models.Dog;

import org.springframework.data.repository.CrudRepository;

import com.springsample.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
        List<Dog> findByName(String name);
}

