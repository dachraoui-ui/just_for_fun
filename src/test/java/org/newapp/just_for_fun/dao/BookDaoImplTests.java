package org.newapp.just_for_fun.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.newapp.just_for_fun.dao.impl.BookDaoImpl;
import org.newapp.just_for_fun.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests{
    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl underTest;

    @Test
    public void testBookCreation(){
        Book book = Book.builder()
                .isbn("9780062315007")
                .title("The Alchemist")
                .authorId(1L)
                .build();

        underTest.create(book);

        verify(jdbcTemplate).update(eq("INSERT INTO books (isbn,title,author_id) VALUES (?,?,?)"),
                eq("9780062315007"),eq("The Alchemist"),eq(1L));

    }
}
