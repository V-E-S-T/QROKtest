package com.book.service;

import com.book.model.Author;
import com.book.model.Book;
import com.book.model.Reward;

import java.util.List;

public interface AuthorService {

    Author update(Author author, int id);

    Author save(Author author);

    boolean delete(int author_id);

    Author get(int author_id);

    List<Author> getAll();

    List<Book> listBooks(int author_id);

    List<Reward> listRewards(int author_id);

}
