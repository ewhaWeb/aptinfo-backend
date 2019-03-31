package com.ewha.aptinfobackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewha.aptinfobackend.entity.AreaData;
import com.ewha.aptinfobackend.entity.MonthData;
import com.ewha.aptinfobackend.service.AreaDataService;
import com.ewha.aptinfobackend.service.AvgDataCalculator;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/aptinfo-backend")
public class DetailController {

	@Autowired
	AreaDataService service;
	
	@Autowired
	AvgDataCalculator calculator;

	/*@GetMapping("/admin/detail/allAreaData")
	public List<AreaData> getAllAreaData() {
		System.out.println("Controller");

		List<AreaData> area = new ArrayList<>();
		area.addAll(service.findAllAreaData());

		System.out.println("result: " + area);

		return area;
	}*/

	@PostMapping("/admin/detail/areainfo")
	public AreaData findAreaData(@RequestBody AreaData areaData) {
		System.out.println("findAreaData Controller");

		AreaData area = new AreaData();
		area = service.findAreaData(areaData.getGuCode(), areaData.getTargetYear(), areaData.getTargetMonth());
		// AreaData area = new AreaData();
		// area = service.findAreaData(targetMonth);
		System.out.println("result: " + area);

		return area;
	}

	@PostMapping("/admin/detail/mdata")
	public List<MonthData> findMonthData(@RequestBody MonthData monthData) {

		// public AreaData findAreaData() {
		System.out.println("findMonthData Controller");

		List<MonthData> data = calculator.findMonthData(monthData.getGuCode(), monthData.getTargetYear());
		//calculator.findMonthData(monthData.getGuCode(), monthData.getTargetYear()).forEach(data::add);;
		// AreaData area = new AreaData();
		// area = service.findAreaData(targetMonth);
		//System.out.println("result: " + data);

		return data;
	}
}
