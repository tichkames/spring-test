package com.hod.spring.test.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Manga {
    private String title;
    private String synopsis;
    private Integer volumes;
    private Double score;
}
