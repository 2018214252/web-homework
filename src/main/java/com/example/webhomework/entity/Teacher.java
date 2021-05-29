package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("teacher")
public class Teacher {
    private Long id;
    private String name;
    private String profession;
}
