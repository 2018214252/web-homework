package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("teacher")
public class Teacher {
    @NotNull(message = "教师id不能为空")
    private Long id;
    @NotNull(message = "教师姓名不能为空")
    private String name;
    private String profession;
}
