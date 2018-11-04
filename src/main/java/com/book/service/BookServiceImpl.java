package com.book.service;

import com.book.dao.BookRepository;
import com.book.model.Author;
import com.book.model.Book;
import com.book.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create(String title, String isbn, Genre genre) {

        Assert.hasText(title);
        Assert.hasText(isbn);
        Assert.notNull(genre, "genre must not be null");
        return bookRepository.create(title, isbn, genre);
    }

    @Override
    public Book save(Book book) {

        Assert.notNull(book, "Can not save empty book parameter");
        return bookRepository.save(book);
    }

    @Override
    public boolean delete(int book_id) {

        Assert.isTrue(bookRepository.isExist(book_id), "Book with this ID does not exist");
        return bookRepository.delete(book_id);
    }

    @Override
    public Book get(int book_id) {

        Assert.isTrue(bookRepository.isExist(book_id), "Book with this ID does not exist");
        return bookRepository.get(book_id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public List<Author> listAuthors(int book_id) {

        Assert.isTrue(bookRepository.isExist(book_id), "Book with this ID does not exist");
        return bookRepository.listAuthors(book_id);
    }
}
