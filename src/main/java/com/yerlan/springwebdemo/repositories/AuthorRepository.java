package com.yerlan.springwebdemo.repositories;

import com.yerlan.springwebdemo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
