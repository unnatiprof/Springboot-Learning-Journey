package com.springframework.spring_6_webapp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity //Create a table named book in DB
public class Book {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // GeneratedValue -> auto increment
	private Long id;
	private String title;
	private String isbn;

	
	//owner side
	@ManyToMany
	// JoinTable joins tables & JoinColumn joins columns
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name ="book_id"),
	inverseJoinColumns =@JoinColumn(name = "author_id"))
	private Set<Author> authors = new HashSet<>();
	
	
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
		
		
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", authors=" + authors + "]";
	}
}
