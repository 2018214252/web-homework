package com.example.webhomework.service;

import com.example.webhomework.dto.TeacherDTO;
import com.example.webhomework.entity.Teacher;
import com.example.webhomework.mapper.CourseMapper;
import com.example.webhomework.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private CourseMapper courseMapper;

    public List<Teacher> listTeachers(){
        return teacherMapper.listTeachers();
    }

    public List<Teacher> insertTeacher(Teacher teacher){
        teacherMapper.insert(teacher);
        return teacherMapper.listTeachers();
    }

    public List<Teacher> deleteTeacher(long tid){
        teacherMapper.remove(tid);
        return teacherMapper.listTeachers();
    }

    public List<Teacher> updateTeacher(Teacher teacher){
        teacherMapper.update(teacher);
        return teacherMapper.listTeachers();
    }

    public TeacherDTO getTeacher(long tid){
        if(courseMapper.getCourses(tid).size()==0){
            TeacherDTO teacherDTO = teacherMapper.getTea0(tid);
            teacherDTO.setCourses(new ArrayList<>());
            return teacherDTO;
        }
        return teacherMapper.getTea(tid);
    }

    public Teacher getTeacherById(long tid){
        return teacherMapper.getTeacherById(tid);
    }

}
