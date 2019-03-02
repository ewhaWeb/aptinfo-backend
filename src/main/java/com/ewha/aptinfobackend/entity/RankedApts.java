package com.ewha.aptinfobackend.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RankedApts {
    private int id;
    private int GU_CODE;
    private String targetYear;
    private String targetMonth;
    private String[] top5Apts = new String[5];
    private String[] bottom5Apts = new String[5];


}
