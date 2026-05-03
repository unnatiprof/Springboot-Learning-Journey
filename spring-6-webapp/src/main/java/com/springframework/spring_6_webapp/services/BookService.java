package com.springframework.spring_6_webapp.services;

import com.springframework.spring_6_webapp.domain.Book;

public interface BookService {
	Iterable<Book> findAll();

}
