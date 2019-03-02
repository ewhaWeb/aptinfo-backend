package com.ewha.aptinfobackend.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AreaInfo {
    @Id @GeneratedValue
    private int id;
    private int GU_CODE;
    private String name;
    private String targetYear;
    private String targetMonth;
    private int maxPrice;
    private int minPrice;
    private int trxnAmount;
    private int population;
    private boolean isIssue;

}
