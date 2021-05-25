package com.example.webhomework.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private long id;
    private String name;
    private int classHour;
}
