package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("course")
public class Course {
    private long cid;
    private long tid;
    private String name;
    private int classHour;
    private int studentNumber;
}
