package com.book.dto;

import com.book.model.Author;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorDTO {

    private String firstName;
    private String lastName;
    private int age;
    private List<String> listBook;

    public AuthorDTO(Author author) {

        this.firstName = author.getFirstName();
        this.lastName = author.getLastName();

        LocalDate currentDate = LocalDate.now();
        this.age = currentDate.getYear() - author.getBirthDate().getYear();

        this.listBook = author.getBookList().stream().map(book -> book.getTitle()).collect(Collectors.toList());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getListBook() {
        return listBook;
    }
}
