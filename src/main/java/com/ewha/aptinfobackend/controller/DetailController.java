package com.ewha.aptinfobackend.controller;

import com.ewha.aptinfobackend.entity.AreaInfo;
import com.ewha.aptinfobackend.entity.AreaMetadata;
import com.ewha.aptinfobackend.entity.MonthData;
import com.ewha.aptinfobackend.entity.RankedApt;
import com.ewha.aptinfobackend.repository.AreaRepository;
import com.ewha.aptinfobackend.repository.AvgDataRepository;
import com.ewha.aptinfobackend.repository.MetadataRepository;
import com.ewha.aptinfobackend.repository.RankedAptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/v1/api", produces = MediaTypes.HAL_JSON_UTF8_VALUE)
public class DetailController {
    @Autowired
    RankedAptRepository rankedAptRepository;
    @Autowired
    AvgDataRepository avgDataRepository;
    @Autowired
    AreaRepository areaRepository;
    @Autowired
    MetadataRepository metadataRepository;


    @GetMapping("/areas")
    public List<String> getAreas () {
        List<AreaMetadata> areas = metadataRepository.findByParent(11000);
        return areas.stream().map(AreaMetadata::getName).collect(Collectors.toList());
    }

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


    @GetMapping("/{year}/{month}/{gu_code}/areainfo")
    public AreaInfo findAreaInfo(@PathVariable int gu_code
            , @PathVariable String year
            , @PathVariable String month) {

        return areaRepository.findByGuCodeAndTargetYearAndTargetMonth(gu_code,year,month);
    }

    @GetMapping("/{year}/{gu_code}/mdata")
    public ArrayList<MonthData> findMonthData(
            @PathVariable String year,
            @PathVariable Integer gu_code) {

        return avgDataRepository.findByGuCodeAndTargetYear(gu_code,year);
    }


}
