package com.example.webhomework.service;

import com.example.webhomework.entity.Course;
import com.example.webhomework.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public void insertCourse(Course course){
        courseMapper.insert(course);
    }
}
