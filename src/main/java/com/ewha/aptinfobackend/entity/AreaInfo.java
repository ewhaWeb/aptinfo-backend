package com.ewha.aptinfobackend.entity;


import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Immutable
@Table(name = "area_data")
public class AreaInfo {
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


}
