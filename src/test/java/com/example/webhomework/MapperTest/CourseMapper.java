package com.example.webhomework.MapperTest;

import com.example.webhomework.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(value = false)
public class CourseMapper {
    @Autowired
    private com.example.webhomework.mapper.CourseMapper courseMapper;

    @Test
    void insertCourse(){
        Course course = Course.builder().tid(2018214253L).name("java程序设计").classHour(72).studentNumber(60).build();
        courseMapper.insert(course);
    }

    @Test
    void updateCourse(){
        Course course = Course.builder().id(1398277502454464514L).tid(2018214252L).name("java程序设计").classHour(72).studentNumber(70).build();
        courseMapper.update(course);
    }
}
