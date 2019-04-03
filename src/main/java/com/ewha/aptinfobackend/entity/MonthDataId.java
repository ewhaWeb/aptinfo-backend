package com.ewha.aptinfobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MonthDataId implements Serializable {

    private int guCode;
    private String targetYear;
    private String targetMonth;

}
