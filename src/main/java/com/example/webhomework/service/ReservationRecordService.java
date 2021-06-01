package com.example.webhomework.service;

import com.example.webhomework.entity.ReservationRecord;
import com.example.webhomework.mapper.ReservationRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationRecordService {
    @Autowired
    private ReservationRecordMapper reservationRecordMapper;

    public void insertRecord(ReservationRecord record){
        reservationRecordMapper.insert(record);
    }

    public List<ReservationRecord> listALLRecords(){
        return reservationRecordMapper.listALLRecords();
    }
}

