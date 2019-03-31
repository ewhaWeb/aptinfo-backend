package com.ewha.aptinfobackend.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewha.aptinfobackend.entity.MonthData;

public interface AvgDataRepository extends JpaRepository<MonthData,Integer> {
    // 12달 간의 거래평균가만 담은 Integer[]로 만들고 싶음.
   // ArrayList<MonthData> findByTargetYearAndTargetAreaCode(String year, Integer gu_code);

	// 월별로 거래관련 계산값 조회(최대값, 최소값, 평균값, 거래건수 등)
	ArrayList<MonthData> findByGuCodeAndTargetYear(int guCode, String targetYear);
}
