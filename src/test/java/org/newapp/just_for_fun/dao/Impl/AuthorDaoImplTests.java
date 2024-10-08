package org.newapp.just_for_fun.dao.Impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.newapp.just_for_fun.TestDataUtil;
import org.newapp.just_for_fun.dao.impl.AuthorDaoImpl;
import org.newapp.just_for_fun.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImpl underTest;

    @Test
    public void testThatCreateAuthorGeneratesCorrectSQL() {
        Author author = TestDataUtil.createTestAuthor();

        underTest.create(author);

        verify(jdbcTemplate).update(eq("INSERT INTO authors (id,name,age) VALUES (?,?,?)"),
                eq(1L),eq("ahmed"),eq(40));
    }

    @Test
    public void testThatFindOneAuthorGenerateCorrectSQL(){

        underTest.findOne(1L);

        verify(jdbcTemplate).query(
                eq("SELECT id , name , age FROM authors WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<AuthorDaoImpl.AuthorRowMapper>any(),
               eq(1L));
    }
}
