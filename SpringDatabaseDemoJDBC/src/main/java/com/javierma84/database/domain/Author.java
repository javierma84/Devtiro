package com.javierma84.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

    private Long id;    //Use Long instead of long because Long is an object and can be null, long default is 0

    private String name;

    private Integer age;
}
