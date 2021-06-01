package com.example.webhomework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.webhomework.entity.Course;
import com.example.webhomework.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
    @Update("update course set name = #{name}, class_hour = #{classHour},student_number = #{studentNumber} where id = #{id}")
    public void update(Course course);
    @Delete("delete from course where id = #{id}")
    public void remove(long id);
    @Select("select * from course where tid = #{tid}")
    List<Course> getCourses(long tid);
}
