package com.example.webhomework.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    private long id;
    private String name;
    private String profession;
    private List<Course> courses;
}
