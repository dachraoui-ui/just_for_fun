package org.newapp.just_for_fun;

import org.newapp.just_for_fun.domain.Author;

public final class TestDataUtil {
    private TestDataUtil(){
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("ahmed")
                .age(40)
                .build();
    }
}
