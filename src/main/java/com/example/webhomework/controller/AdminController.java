package com.example.webhomework.controller;

import com.example.webhomework.entity.Lab;
import com.example.webhomework.service.LabService;
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
    @DeleteMapping("lab")
    public ResultVO deleteLab(@RequestBody Lab lab){
        labService.deleteLab(lab);
        return ResultVO.success(Map.of("labs",labService.listLabs()));
    }





}
