package com.hod.spring.test.mockitoannotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MockitoExceptionTest {

    @Test
    public void whenConfigNonVoidRetunMethodToThrowEx_thenExIsThrown() {

        assertThrows(NullPointerException.class, () -> {

            MyDictionary dictMock = mock(MyDictionary.class);

            when(dictMock.getMeaning(anyString()))
                    .thenThrow(NullPointerException.class);

            dictMock.getMeaning("word");
        });
    }

    @Test
    public void whenConfigVoidRetunMethodToThrowEx_thenExIsThrown() {

        assertThrows(IllegalStateException.class, () -> {

            MyDictionary dictMock = mock(MyDictionary.class);

            doThrow(IllegalStateException.class)
                    .when(dictMock)
                    .add(anyString(), anyString());

            dictMock.add("word", "meaning");
        });
    }
}
