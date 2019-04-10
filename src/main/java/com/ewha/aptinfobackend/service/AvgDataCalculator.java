package com.ewha.aptinfobackend.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewha.aptinfobackend.entity.MonthData;
import com.ewha.aptinfobackend.repository.AvgDataRepository;

@Service
@Transactional
public class AvgDataCalculator {

	@Autowired
	AvgDataRepository avgDataRepository;

	/*
	 * public List<AreaData> findAreaData(String guCode, String targetYear, String
	 * targetMonth){ System.out.println("find data - Service"); return
	 * areaDataRepository.findByGuCodeAndTargetYearAndTargetMonth(guCode,
	 * targetYear, targetMonth)(); }
	 */

	public ArrayList<MonthData> findMonthData(int guCode, String targetYear) {
		System.out.println("find month data - Service");
		ArrayList<MonthData> data= new ArrayList<>();
		avgDataRepository.findByGuCodeAndTargetYear(guCode, targetYear).forEach(data::add);
		System.out.println(data);
		return data;
	}

}
