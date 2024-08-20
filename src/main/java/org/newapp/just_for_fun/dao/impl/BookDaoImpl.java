package org.newapp.just_for_fun.dao.impl;

import org.newapp.just_for_fun.dao.BookDao;
import org.newapp.just_for_fun.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Book book) {
        jdbcTemplate.update("INSERT INTO books (isbn,title,author_id) VALUES (?,?,?)",
                book.getIsbn(),book.getTitle(),book.getAuthorId());
    }
}
