package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("reservation_record")
public class ReservationRecord {
    private long id;
    private long lid;
    private long tid;
    private String courseName;
    private int week;//周次
    private int day;//星期几
    private int lesson;//第几节课
}
