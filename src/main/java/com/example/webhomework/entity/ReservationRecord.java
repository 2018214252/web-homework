package com.example.webhomework.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationRecord {
    private long id;
    private long lid;
    private long tid;
    private String courseName;
    private LocalDateTime localDateTime;
}
