package org.newapp.just_for_fun.dao;

import org.newapp.just_for_fun.domain.Author;

import java.util.Optional;

public interface AuthorDao {

    void create(Author author);

    Optional<Author> findOne(Long l);
}
