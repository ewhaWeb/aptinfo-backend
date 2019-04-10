package com.ewha.aptinfobackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(MonthDataId.class)
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MonthData {
	 /*  @Id @GeneratedValue
    private int id;*/
  @Id
  private int guCode;
  @Id
  private String targetYear;
  @Id
  private String targetMonth;
  private int maxPrice;
  private int minPrice;
  private int avgPrice;
  private int trxnAmount;

}
