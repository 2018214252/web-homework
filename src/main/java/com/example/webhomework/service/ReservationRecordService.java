package com.example.webhomework.service;

import com.example.webhomework.entity.ReservationRecord;
import com.example.webhomework.mapper.ReservationRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationRecordService {
    @Autowired
    private ReservationRecordMapper reservationRecordMapper;

    @CacheEvict(value = "records", key = "#tid")
    public void insertRecord(ReservationRecord record,long tid) {
        reservationRecordMapper.insert(record);
    }

    public List<ReservationRecord> listALLRecords() {
        return reservationRecordMapper.listALLRecords();
    }

    @Cacheable(value = "records", key = "#tid")
    public List<ReservationRecord> getRecords(long tid) {
        return reservationRecordMapper.getRecords(tid);
    }

    @CacheEvict(value = "records", key = "#tid")
    public void deleteRecord(long id,long tid) {
        reservationRecordMapper.deleteRecord(id);
    }

}

