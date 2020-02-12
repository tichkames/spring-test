package com.hod.spring.test.beanmother;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class Book {
    private String title;
    private String language;
    private Date publishedAt;
}
