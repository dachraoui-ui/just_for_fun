package org.newapp.just_for_fun.dao.impl;

import org.newapp.just_for_fun.dao.BookDao;
import org.newapp.just_for_fun.domain.Author;
import org.newapp.just_for_fun.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

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
    @Override
    public Optional<Book> find(String  bookId) {
        List<Book> results =
                jdbcTemplate.query("SELECT isbn , title , author_id from books where isbn = ? limit 1",
                        new BookMapper(), bookId);
        return results.stream().findFirst();
    }

    public static class BookMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Book.builder()
                    .isbn(rs.getString("isbn"))
                    .title(rs.getString("title"))
                    .authorId(rs.getLong("authorId"))
                    .build();
        }
    }
}
