package com.example.webhomework.dto;

import com.example.webhomework.entity.Course;
import lombok.*;
import org.checkerframework.checker.units.qual.A;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeacherDTO {
    private Long id;
    private String name;
    private String profession;
    private List<Course> courses;
}
