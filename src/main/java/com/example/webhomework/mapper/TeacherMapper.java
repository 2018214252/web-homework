package com.example.webhomework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.webhomework.dto.TeacherDTO;
import com.example.webhomework.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    @Select("select * from teacher")
    List<Teacher> listTeachers();
    @Delete("delete from teacher where id = #{id}")
    public void remove(long tid);
    @Update("update teacher set name = #{name}, profession = #{profession} where id = #{id}")
    public void update(Teacher teacher);
    @Select("select * from teacher where id = #{id}")

    TeacherDTO getTea(long tid);
}
