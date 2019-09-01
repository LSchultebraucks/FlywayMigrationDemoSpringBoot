package com.lasseschultebraucks.flyway.demo.repository;

import com.lasseschultebraucks.flyway.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
