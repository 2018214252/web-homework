package com.example.webhomework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.webhomework.entity.Course;
import com.example.webhomework.entity.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
    @Update("update course set name = #{name}, class_hour = #{classHour},student_number = #{studentNumber} where id = #{id}")
    public void update(Course course);
    @Delete(("DELETE from course where id = #{id}"))
    public void remove(long id);
}
