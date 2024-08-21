package org.newapp.just_for_fun.dao.Impl;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.newapp.just_for_fun.TestDataUtil;
import org.newapp.just_for_fun.dao.impl.AuthorDaoImpl;
import org.newapp.just_for_fun.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AuthorDaoImplIntegrationTest {
    private AuthorDaoImpl underTest;

    @Autowired
    public AuthorDaoImplIntegrationTest(AuthorDaoImpl underTest){
        this.underTest = underTest;
    }

    @Test
    public void testThatAuthorCanBeCreateAndRecalled(){
        Author author = TestDataUtil.createTestAuthor();

    }
}
