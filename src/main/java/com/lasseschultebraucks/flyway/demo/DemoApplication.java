package com.lasseschultebraucks.flyway.demo;

import com.lasseschultebraucks.flyway.demo.model.Author;
import com.lasseschultebraucks.flyway.demo.model.Book;
import com.lasseschultebraucks.flyway.demo.repository.AuthorRepository;
import com.lasseschultebraucks.flyway.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public DemoApplication(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        clearTables();

        Author author = new Author();
        author.setName("J.K. Rowling");
        Book book = new Book();
        book.setName("Harry Potter and the Philosopher’s Stone");
        book.setAuthor(author);
        Book book1 = new Book();
        book1.setName("Harry Potter and the Chamber of Secrets");
        book1.setAuthor(author);
        author.setBookCollection(Arrays.asList(
                book, book1
        ));
        authorRepository.save(author);
        bookRepository.save(book);
        bookRepository.save(book1);
    }

    private void clearTables() {
        authorRepository.deleteAll();
        bookRepository.deleteAll();
    }
}
