package com.example.webhomework.controller;

import com.example.webhomework.common.Role;
import com.example.webhomework.entity.Lab;
import com.example.webhomework.service.LabService;
import com.example.webhomework.service.TeacherService;
import com.example.webhomework.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(value = "处理用户通用操作请求", tags = {"Authorization"})
@RestController
@RequestMapping("/api/common/")
public class CommonController {
    @Autowired
    private LabService labService;
    @Autowired
    private TeacherService teacherService;

    @ApiOperation("加载所有实验室信息")
    @GetMapping("labs")
    private ResultVO getLabs(){
        List<Lab>labs = labService.listLabs();
        return ResultVO.success(Map.of("labs",labs));
    }

    @ApiOperation("登录后首页信息，加载教师信息")
    @GetMapping("teacher")
    public ResultVO getTeacher(@RequestAttribute("uid") long uid, @RequestAttribute("role") int role){
        if(role == Role.TEACHER){
            return ResultVO.success(Map.of("teacher",teacherService.getTeacher(uid)));
        }
        return ResultVO.success(Map.of());
    }


}
