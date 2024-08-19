package org.newapp.just_for_fun.dao.impl;

import org.newapp.just_for_fun.dao.BookDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
