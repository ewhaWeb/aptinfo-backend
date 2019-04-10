package com.ewha.aptinfobackend.repository;

import com.ewha.aptinfobackend.entity.AreaInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaRepository extends JpaRepository<AreaInfo,Integer> {

    // 전체 리스트 조회
    List<AreaInfo> findAll();
    AreaInfo findByGuCodeAndTargetYearAndTargetMonth(int guCode, String targetYear, String targetMonth);

}