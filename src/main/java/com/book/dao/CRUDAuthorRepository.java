package com.book.dao;

import com.book.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CRUDAuthorRepository extends JpaRepository<Author, Integer>{

    @Transactional
    @Override
    Author save(Author author);

    Author findById(int author_id);

    @Modifying
    @Transactional
    boolean deleteById(int author_id);

    @Override
    List<Author> findAll();

    //boolean countDistinctById(int v);

    int countById(int author_id);

}
