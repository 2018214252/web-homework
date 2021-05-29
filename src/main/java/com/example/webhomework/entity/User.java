package com.example.webhomework.entity;

import com.example.webhomework.common.Role;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private long id;
    private String userName;
    private String password;
    private Integer role;
}
