package com.yerlan.springwebdemo.repositories;

import com.yerlan.springwebdemo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
