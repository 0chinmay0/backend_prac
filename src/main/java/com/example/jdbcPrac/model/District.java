package com.example.jdbcPrac.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class District {
    int district_code;
    String district_name;
    int state_code;
}
