package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("lab")
public class Lab {
    private long id;
    private int machineNumber;
    private String details;
}
