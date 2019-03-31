package com.ewha.aptinfobackend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewha.aptinfobackend.entity.AreaData;
import com.ewha.aptinfobackend.repository.AreaDataRepository;

@Service
@Transactional
public class AreaDataService {

	@Autowired
	AreaDataRepository areaDataRepository;

	public List<AreaData> findAllAreaData() {
		System.out.println("service");
		List<AreaData> area = new ArrayList<>();
		areaDataRepository.findAll().forEach(area::add);
		for(AreaData a : area) {
			System.out.println(a);
		}
		
		return area;
	}

	/*
	 * public List<AreaData> findAreaData(String guCode, String targetYear, String
	 * targetMonth){ System.out.println("find data - Service"); return
	 * areaDataRepository.findByGuCodeAndTargetYearAndTargetMonth(guCode,
	 * targetYear, targetMonth)(); }
	 */

	public AreaData findAreaData(int guCode, String targetYear, String targetMonth) {
		System.out.println("find data - Service");
		return areaDataRepository.findByGuCodeAndTargetYearAndTargetMonth(guCode, targetYear, targetMonth);
	}

}
