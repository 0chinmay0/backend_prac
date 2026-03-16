package com.example.jdbcPrac.dao;

import com.example.jdbcPrac.model.District;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class DistrictRepo {


    private DataSource dataSource;

    public DistrictRepo(DataSource dataSource) {
        this.dataSource = dataSource;
    }



    public List<District> getDemo(){
        String qs= "select * from district_master";
        ArrayList<District> list = new ArrayList<>();

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps=conn.prepareStatement(qs);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            District obj=District.builder()
                    .district_name(rs.getString("district_name"))
                    .district_code(rs.getInt("district_code"))
                    .state_code(rs.getInt("state_code"))
                    .build();
            list.add(obj);
            }
        }catch (Exception e){
            log.error("error at getting district due to connection ",e);
        }
        return list;
    }


    public void  setInfo(){
        String qs = "INSERT INTO district_master  VALUES (?, ?,?) ";
        try{
            Connection con = dataSource.getConnection();
            //PreparedStatement ps=con.prepareStatement();
            System.out.print("gtg");
        }catch(Exception e){

        }
    }

    public void  getInfo(){
        String qs = "INSERT INTO district_master  VALUES (?, ?,?) ";
        try{
            Connection con = dataSource.getConnection();
            //PreparedStatement ps=con.prepareStatement();
            System.out.print("gtg");
        }catch(Exception e){

        }
    }

}
