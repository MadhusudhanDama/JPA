package com.tendecoders.services;
import java.util.List;

//import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tendecoders.model.Book;
import com.tendecoders.repository.BookRepository;

@Component
public class Service {

	@Autowired
	BookRepository bookRepository;

	public Book create(Book book) {

		return bookRepository.save(book);
	}

	public List<Book> getall() {

		return (List<Book>) bookRepository.findAll();

	}

	public Book get(long id) {

		return bookRepository.findById(id).get();

	}

	public void delete(int id) {

		Book lib = get(id);
		bookRepository.delete(lib);

	}

}