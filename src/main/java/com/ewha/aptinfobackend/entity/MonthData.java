package com.ewha.aptinfobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

