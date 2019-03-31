package com.ewha.aptinfobackend.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Immutable
public class AreaData {
   /* @Id @GeneratedValue
    private int id;*/
	
	@Id
    private int guCode;
    private String areaNm;
    private String targetYear;
    private String targetMonth;
    private int maxPrice;
    private int minPrice;
    private int avgPrice;
    private int trxnAmount;
    private int population;
    private String isIssue;
    

}
