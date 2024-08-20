package org.newapp.just_for_fun.dao.impl;

import org.newapp.just_for_fun.dao.AuthorDao;
import org.newapp.just_for_fun.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImpl implements AuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update("INSERT INTO authors (id,name,age) VALUES (?,?,?)",
                author.getId(),author.getName(),author.getAge());
    }
}
