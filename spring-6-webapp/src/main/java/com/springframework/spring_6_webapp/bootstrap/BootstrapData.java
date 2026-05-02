package com.springframework.spring_6_webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.spring_6_webapp.domain.Author;
import com.springframework.spring_6_webapp.domain.Book;
import com.springframework.spring_6_webapp.repositories.AuthorRepository;
import com.springframework.spring_6_webapp.repositories.BookRepository;

@Component

public class BootstrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author eric = new Author();
		eric.setFirstName("Eric");
		eric.setLastName("Evans");
		
		Book ddd = new Book();
		ddd.setTitle("Domain Driven Design");
		ddd.setIsbn("123456");
		
		Author rod = new Author();
		rod.setFirstName("Rod");
		rod.setLastName("Johnson");
		
		Book noEJB = new Book();
		noEJB.setTitle("J2EE Development without EJB");
		noEJB.setIsbn("54757585");
		
		Author rodSaved = authorRepository.save(rod);
		Book noEJBSaved = bookRepository.save(noEJB);
		
		//ericSaved.getBooks().add(dddSaved);
		rodSaved.getBooks().add(noEJBSaved);
		
		System.out.println("In Bootstrap");
		System.out.println("Author Count: "+ authorRepository.count());
		System.out.println("Book Count: "+ bookRepository.count());
		
		
		
	}

}
