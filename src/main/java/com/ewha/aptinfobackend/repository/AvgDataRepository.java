package com.ewha.aptinfobackend.repository;

import com.ewha.aptinfobackend.entity.MonthData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface AvgDataRepository extends JpaRepository<MonthData,Integer> {
    // 12달 간의 거래평균가만 담은 Integer[]로 만들고 싶음.
    ArrayList<MonthData> findByTargetYearAndTargetAreaCode(String year, Integer gu_code);

}
