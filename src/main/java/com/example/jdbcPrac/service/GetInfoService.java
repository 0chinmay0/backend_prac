package com.example.jdbcPrac.service;

import com.example.jdbcPrac.model.District;

import java.util.List;

public interface GetInfoService {

    public List<District> getAllInfo();
    public void setDistrictInfo();
}
