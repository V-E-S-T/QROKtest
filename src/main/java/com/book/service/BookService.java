package com.book.service;

import com.book.model.Author;
import com.book.model.Book;

import java.util.List;

public interface BookService {

    Book update(Book book, int id);

    Book save(Book book);

    boolean delete(int book_id);

    Book get(int book_id);

    List<Book> getAll();

    List<Author> listAuthors(int book_id);
}
