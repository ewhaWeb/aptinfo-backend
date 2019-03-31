package com.ewha.aptinfobackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewha.aptinfobackend.entity.AreaData;

public interface AreaDataRepository extends JpaRepository<AreaData,Integer> {
   
	// 전체 리스트 조회
	List<AreaData> findAll();
	
	// 구 코드, 년도, 월로 검색
	AreaData findByGuCodeAndTargetYearAndTargetMonth(int guCode, String targetYear, String targetMonth);

	//AreaData findByTargetMonth(String targetMonth);

}
