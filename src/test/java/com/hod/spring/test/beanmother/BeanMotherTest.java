package com.hod.spring.test.beanmother;

import io.beanmother.core.ObjectMother;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BeanMotherTest {
    ObjectMother objectMother = ObjectMother.getInstance();

    @Test
    public void testSingleObject() {
        Book book = objectMother.bear("book", Book.class);
        Author author = objectMother.bear("author", Author.class);

        System.out.println(String.format("book %s", book));
        System.out.println(String.format("author %s", author));
    }

    @Test
    public void testMultipleObjects() {
        List<Author> authors = objectMother.bear("author", Author.class, 10);
        System.out.println(String.format("authors %s", authors));
    }
}
