package com.hod.spring.test.beanmother;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Author {
    private long id;
    private String name;
    private String introduction;
    private String birth;
    private String gender;
    private List<String> works;
}
