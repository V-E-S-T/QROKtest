package com.book.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "authors_books", joinColumns = @JoinColumn(name = "author_id"),
    inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> bookList = new ArrayList<>();

    @Column(name = "birthDate")
    private Date birthDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "reward_id")
    private List<Reward> rewardList = new ArrayList<>();

    public Author() {
    }

    public Author(String firstName, String lastName, Sex sex, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Reward> getRewardList() {
        return rewardList;
    }

    public void setRewardList(List<Reward> rewardList) {
        this.rewardList = rewardList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (getFirstName() != null ? !getFirstName().equals(author.getFirstName()) : author.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(author.getLastName()) : author.getLastName() != null)
            return false;
        if (getSex() != author.getSex()) return false;
        if (getBookList() != null ? !getBookList().equals(author.getBookList()) : author.getBookList() != null)
            return false;
        if (getBirthDate() != null ? !getBirthDate().equals(author.getBirthDate()) : author.getBirthDate() != null)
            return false;
        return getRewardList() != null ? getRewardList().equals(author.getRewardList()) : author.getRewardList() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", bookList=" + bookList +
                ", birthDate=" + birthDate +
                ", rewardList=" + rewardList +
                '}';
    }
}
