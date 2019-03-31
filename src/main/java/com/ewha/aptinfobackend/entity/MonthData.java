package com.ewha.aptinfobackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MonthData {
  /*  @Id @GeneratedValue
    private int id;*/
	@Id
	private int guCode;
    private String targetYear;
    private String targetMonth;
    private int maxPrice;
    private int minPrice;
    private int avgPrice;
    private int trxnAmount;

}
