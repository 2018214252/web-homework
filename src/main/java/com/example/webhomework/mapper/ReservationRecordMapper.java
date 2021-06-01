package com.example.webhomework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.webhomework.entity.ReservationRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReservationRecordMapper extends BaseMapper<ReservationRecord> {
    @Select("select * from reservation_record")
    List<ReservationRecord> listALLRecords();
}
