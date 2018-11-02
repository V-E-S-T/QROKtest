package com.book.dao;

import com.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CRUDBookRepository extends JpaRepository<Book, Integer> {

    @Transactional
    @Override
    Book save(Book book);

    Book findById(int book_id);

    @Modifying
    @Transactional
    boolean deleteById(int author_id);

    List<Book> findBooksByGenre();

    List<Book> findAll();
}
