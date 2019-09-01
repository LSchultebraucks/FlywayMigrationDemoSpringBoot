package com.lasseschultebraucks.flyway.demo.repository;

import com.lasseschultebraucks.flyway.demo.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
