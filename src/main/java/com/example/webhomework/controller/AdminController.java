package com.example.webhomework.controller;

import com.example.webhomework.entity.Lab;
import com.example.webhomework.entity.Teacher;
import com.example.webhomework.service.LabService;
import com.example.webhomework.service.TeacherService;
import com.example.webhomework.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "处理管理员操作请求",tags = {"Authorization, Admin"})
@RestController
@RequestMapping("/api/admin/")
public class AdminController {
    @Autowired
    private LabService labService;
    @Autowired
    private TeacherService teacherService;

    @ApiOperation("添加实验室，并返回当前所有实验室")
    @PostMapping("lab")
    public ResultVO insertLab(@RequestBody Lab lab){
        labService.insertLab(lab);
        return ResultVO.success(Map.of("labs",labService.listLabs()));
    }

    @ApiOperation("更新实验室，并返回当前所有实验室")
    @PatchMapping("lab")
    public ResultVO updateLab(@RequestBody Lab lab){
        labService.updateLab(lab);
        return ResultVO.success(Map.of("labs",labService.listLabs()));
    }

    @ApiOperation("删除实验室，并返回当前所有实验室")
    @DeleteMapping("lab/{id}")
    public ResultVO deleteLab(@PathVariable long id){
        labService.deleteLab(id);
        return ResultVO.success(Map.of("labs",labService.listLabs()));
    }

    @ApiOperation("查看所有教师信息")
    @GetMapping("teachers")
    public ResultVO listTeachers(){
        return ResultVO.success(Map.of("teachers",teacherService.listTeachers()));
    }

    @ApiOperation("添加新教师信息，并返回当前所有教师信息")
    @PostMapping("teacher")
    public ResultVO insertTeacher(@RequestBody Teacher teacher){
        teacherService.insertTeacher(teacher);
        return ResultVO.success(Map.of("teachers",teacherService.listTeachers()));
    }

    @ApiOperation("删除教师，并返回当前所有教师信息")
    @DeleteMapping("teacher/{tid}")
    public ResultVO deleteTeacher(@PathVariable long tid){
        teacherService.deleteTeacher(tid);
        return  ResultVO.success(Map.of("teachers",teacherService.listTeachers()));
    }

    @ApiOperation("更新教师信息，并返回当前所有教师信息")
    @PatchMapping("teacher")
    public ResultVO updateTeacher(@RequestBody Teacher teacher){
        teacherService.updateTeacher(teacher);
        return ResultVO.success(Map.of("teachers",teacherService.listTeachers()));
    }


}
