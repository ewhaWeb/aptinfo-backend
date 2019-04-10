package com.ewha.aptinfobackend.repository;

import com.ewha.aptinfobackend.entity.MonthData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface AvgDataRepository extends JpaRepository<MonthData,Integer> {
    ArrayList<MonthData> findByGuCodeAndTargetYear(Integer guCode, String targetYear);
    
}
