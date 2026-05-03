package com.springframework.spring_6_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring_6_webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	}


