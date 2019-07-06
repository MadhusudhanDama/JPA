package com.tendecoders.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tendecoders.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
	