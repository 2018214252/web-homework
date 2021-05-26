package com.example.webhomework.service;

import com.example.webhomework.entity.Lab;
import com.example.webhomework.mapper.LabMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class LabService {
    @Autowired
    private LabMapper labMapper;

    public List<Lab> listLabs(){
        return labMapper.list();
    }

    public void insertLab(Lab lab){
        labMapper.insert(lab);
    }

    public void updateLab(Lab lab){
        labMapper.updateById(lab);
    }

    public void deleteLab(long id){
        labMapper.remove(id);
    }
}
