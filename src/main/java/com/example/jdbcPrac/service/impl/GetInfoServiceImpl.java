package com.example.jdbcPrac.service.impl;

import com.example.jdbcPrac.dao.DistrictRepo;
import com.example.jdbcPrac.model.District;
import com.example.jdbcPrac.service.GetInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GetInfoServiceImpl implements GetInfoService {

    private DistrictRepo districtRepo;
    public GetInfoServiceImpl(DistrictRepo districtRepo) {
        this.districtRepo = districtRepo;
    }

    @Override
    public List<District> getAllInfo() {
        return  districtRepo.getDemo();
    }
}
