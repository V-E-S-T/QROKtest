package com.book;

import com.book.model.Book;
import com.book.model.Genre;

public class BookTestData {

    public static final Book book_1 = new Book("title_1", "isbn_1", Genre.ADVENTURE);
    public static final Book book_2 = new Book("title_2", "isbn_2", Genre.COMEDY);
    public static final Book book_3 = new Book("title_3", "isbn_3", Genre.FANTASTIC);
    public static final Book book_4 = new Book("title_4", "isbn_4", Genre.NOVEL);
    public static final Book book_5 = new Book("title_5", "isbn_5", Genre.ADVENTURE);
    public static final Book book_6 = new Book("title_6", "isbn_6", Genre.NOVEL);
}
