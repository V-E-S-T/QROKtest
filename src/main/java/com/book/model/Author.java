package com.book.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

//@Entity
//@Table(name = "author")
public class Author {

    private String firstName;
    private String lastName;
    private List<Book> bookList;
    private Date BirthDate;
    private List<Reward> rewardList;

}
