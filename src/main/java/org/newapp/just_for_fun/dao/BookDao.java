package org.newapp.just_for_fun.dao;

import org.newapp.just_for_fun.domain.Author;
import org.newapp.just_for_fun.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);
    Optional<Book> find(String isbn);
}
