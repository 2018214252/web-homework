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
    private Long id;
    private Long lid;
    private Long tid;
    private String courseName;
    private int week;//周次
    private int day;//星期几
    private int lesson;//第几节课
    private String createTime;
}
