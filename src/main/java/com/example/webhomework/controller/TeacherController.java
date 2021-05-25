package com.example.webhomework.controller;

import com.example.webhomework.mapper.LabMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "处理教师操作请求", tags = {"Authorization, Teacher"})
@RestController
@RequestMapping("/api/teacher/")

public class TeacherController {
    @Autowired
    private LabMapper labMapper;

}
