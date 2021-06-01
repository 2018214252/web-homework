package com.example.webhomework.controller;

import com.example.webhomework.entity.Course;
import com.example.webhomework.entity.ReservationRecord;
import com.example.webhomework.mapper.LabMapper;
import com.example.webhomework.service.CourseService;
import com.example.webhomework.service.ReservationRecordService;
import com.example.webhomework.service.TeacherService;
import com.example.webhomework.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "处理教师操作请求", tags = {"Authorization, Teacher"})
@RestController
@RequestMapping("/api/teacher")
@Slf4j

public class TeacherController {
    @Autowired
    private LabMapper labMapper;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private ReservationRecordService reservationRecordService;

    @ApiOperation("添加课程，并返回指定教师信息")
    @PostMapping("course")
    public ResultVO insertCourse(@RequestAttribute("uid") long tid, @RequestBody Course course) {
        course.setTid(tid);
        courseService.insertCourse(course, tid);
        return ResultVO.success(Map.of("teacher", teacherService.getTeacher(tid)));
    }

    @ApiOperation("删除课程，并返回指定教师信息")
    @DeleteMapping("course/{cid}")
    public ResultVO deleteCourse(@RequestAttribute("uid") long tid, @PathVariable long cid) {
        courseService.deleteCourse(cid, tid);
        return ResultVO.success(Map.of("teacher", teacherService.getTeacher(tid)));
    }

    @ApiOperation("修改课程信息，并返回教师信息")
    @PatchMapping("course")
    public ResultVO updateCourse(@RequestAttribute("uid") long tid, @RequestBody Course course) {
        courseService.updateCourse(course, tid);
        return ResultVO.success(Map.of("teacher", teacherService.getTeacher(tid)));
    }

    @ApiOperation("预约课程，返回所有预约记录")
    @PostMapping("record")
    public ResultVO insertRecord(@RequestBody ReservationRecord reservationRecord, @RequestAttribute("uid") long tid) {
        reservationRecordService.insertRecord(reservationRecord, tid);
        return ResultVO.success(Map.of("allrecords", reservationRecordService.listALLRecords(), "records", reservationRecordService.getRecords(tid)));
    }

    @ApiOperation("查看个人预约记录，返回指定教师的预约记录")
    @GetMapping("records")
    public ResultVO getRecords(@RequestAttribute("uid") long tid) {
        return ResultVO.success(Map.of("records", reservationRecordService.getRecords(tid)));
    }

    @ApiOperation("取消预约，返回所有预约记录")
    @DeleteMapping("record/{id}")
    public ResultVO deleteRecord(@RequestAttribute("uid") long tid, @PathVariable long id) {
        reservationRecordService.deleteRecord(id, tid);
        return ResultVO.success(Map.of("allrecords", reservationRecordService.listALLRecords(), "records", reservationRecordService.getRecords(tid)));
    }
}
