package com.ewha.aptinfobackend.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class RankedAptRepositoryTest {

    @Autowired
    RankedAptRepository rankedAptRepository;


    @Test
    public void topFiveTest () {
        System.out.println(rankedAptRepository.findFirst5ByYearAndMonthAndGuOrderByPriceDesc("2019","2",11110));
    }




}