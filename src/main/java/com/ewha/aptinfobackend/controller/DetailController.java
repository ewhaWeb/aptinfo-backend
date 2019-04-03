package com.ewha.aptinfobackend.controller;

import com.ewha.aptinfobackend.entity.MonthData;
import com.ewha.aptinfobackend.entity.RankedApt;
import com.ewha.aptinfobackend.repository.AvgDataRepository;
import com.ewha.aptinfobackend.repository.RankedAptRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/detail", produces = MediaTypes.HAL_JSON_UTF8_VALUE)
public class DetailController {
    @Autowired
    RankedAptRepository rankedAptRepository;
    @Autowired
    AvgDataRepository avgDataRepository;

    @GetMapping ("/{year}/{gu_code}")
    public List<MonthData> getYearlyData (@PathVariable String year,
                                          @PathVariable Integer gu_code) {
        return avgDataRepository.findByGuCodeAndTargetYear(gu_code,year);
    }


    @GetMapping("/{year}/{month}/{gu_code}/topFive")
    public List<RankedApt> getTopFive (@PathVariable String year,
                                         @PathVariable String month,
                                         @PathVariable Integer gu_code) {

        return rankedAptRepository.findFirst5ByYearAndMonthAndGuOrderByPriceDesc(year,month,gu_code);

    }

    @GetMapping("/{year}/{month}/{gu_code}/bottomFive")
    public List<RankedApt> getBottomFive (@PathVariable String year,
                                       @PathVariable String month,
                                       @PathVariable Integer gu_code) {

        return rankedAptRepository.findFirst5ByYearAndMonthAndGuOrderByPriceAsc(year,month,gu_code);

    }




}
