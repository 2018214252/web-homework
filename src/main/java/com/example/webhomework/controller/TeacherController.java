package com.example.webhomework.controller;

import com.example.webhomework.entity.Course;
import com.example.webhomework.mapper.CourseMapper;
import com.example.webhomework.mapper.LabMapper;
import com.example.webhomework.mapper.TeacherMapper;
import com.example.webhomework.service.CourseService;
import com.example.webhomework.service.TeacherService;
import com.example.webhomework.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "处理教师操作请求", tags = {"Authorization, Teacher"})
@RestController
@RequestMapping("/api/teacher/{tid}")

public class TeacherController {
    @Autowired
    private LabMapper labMapper;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseService courseService;

    @ApiOperation("得到该指定教师信息")
    @GetMapping("/information")
    public ResultVO getTeacher(@PathVariable long tid){
        return ResultVO.success(Map.of("teacher",teacherService.getTeacher(tid)));
    }

    @ApiOperation("添加课程，并返回指定教师信息")
    @PostMapping("/course")
    public ResultVO insertCourse(@PathVariable long tid, Course course){
        course.setTid(tid);
        courseService.insertCourse(course);
        return ResultVO.success(Map.of("teacher",teacherService.getTeacher(tid)));
    }

}
