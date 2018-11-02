package com.book.dao;

import com.book.model.Author;
import com.book.model.Book;
import com.book.model.Reward;
import com.book.model.Sex;

import java.util.Date;
import java.util.List;

public interface AuthorRepository {

    Author create(String firstName, String lastName, Sex sex, Date birthDate);

    Author save(Author author);

    boolean delete(int author_id);

    Author get(int author_id);

    List<Author> getAll();

    List<Book> listBooks(int author_id);

    List<Reward> listRewards(int author_id);

    boolean isExist(int author_id);

}
