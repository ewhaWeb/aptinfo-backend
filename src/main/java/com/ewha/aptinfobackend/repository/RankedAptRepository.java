package com.ewha.aptinfobackend.repository;

import com.ewha.aptinfobackend.entity.RankedApt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankedAptRepository extends JpaRepository<RankedApt, Integer> {
    // 하위 5개
    List<RankedApt> findFirst5ByYearAndMonthAndGuOrderByPriceAsc (String year, String month, Integer gu);
    // 상위 5개
    List<RankedApt> findFirst5ByYearAndMonthAndGuOrderByPriceDesc (String year, String month, Integer gu);

}
