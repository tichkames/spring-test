package com.hod.spring.test.mockitoannotations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MockitoMockMethodsTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockitoMethods(){

        //given
        MyList listMock = mock(MyList.class);

        //when
        when(listMock.add(anyString())).thenReturn(false);
        boolean added = listMock.add(randomAlphabetic(6));

        //then
        verify(listMock).add(anyString());
        assertThat(added, is(false));
    }
}
