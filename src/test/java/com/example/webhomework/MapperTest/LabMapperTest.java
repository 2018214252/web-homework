package com.example.webhomework.MapperTest;

import com.example.webhomework.mapper.LabMapper;
import com.example.webhomework.entity.Lab;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
@Rollback(value = false)
@Slf4j
public class LabMapperTest {
    @Autowired
    private LabMapper labMapper;

    @Test
    public void insertTest() {
        Lab lab = Lab.builder()
                .id(902L)
                .machineNumber(70)
                .details("null")
                .build();
        labMapper.insert(lab);
    }

    @Test
    public void listTest() {
        List<Lab>labs = labMapper.list();
        labs.forEach(lab -> log.debug("{}",lab.getId()));
    }
}
