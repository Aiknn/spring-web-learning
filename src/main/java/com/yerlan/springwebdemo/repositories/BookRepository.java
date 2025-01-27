package com.yerlan.springwebdemo.repositories;

import com.yerlan.springwebdemo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
