package com.book.dao;

import com.book.model.Author;
import com.book.model.Book;
import com.book.model.Genre;
import java.util.List;

public interface BookRepository {

    Book create(String title, String isbn, Genre genre);

    Book save(Book book);

    boolean delete(int book_id);

    Book get(int book_id);

    List<Book> getAll();

    List<Author> listAuthors(int book_id);

    boolean isExist(int book_id);
}
