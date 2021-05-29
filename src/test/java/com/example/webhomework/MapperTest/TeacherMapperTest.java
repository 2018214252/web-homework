package com.example.webhomework.MapperTest;

import com.example.webhomework.dto.TeacherDTO;
import com.example.webhomework.entity.Course;
import com.example.webhomework.mapper.CourseMapper;
import com.example.webhomework.mapper.TeacherMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TeacherMapperTest {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void getTeacherTest(){
        TeacherDTO teacherDTO = teacherMapper.getTea(2018214252);
        log.debug(teacherDTO.getName());
    }
}


