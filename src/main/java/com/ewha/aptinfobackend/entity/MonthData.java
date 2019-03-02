package com.ewha.aptinfobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MonthData {
    @Id @GeneratedValue
    private int id;
    @Column(name = "GU_CODE")
    private int targetAreaCode;
    private String targetYear;
    private String targetMonth;
    private int avgPrice;
    private int trxnAmount;

}
