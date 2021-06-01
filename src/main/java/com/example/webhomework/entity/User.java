package com.example.webhomework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.webhomework.common.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("user")
public class User {
    private Long id;
    private Integer role;
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
