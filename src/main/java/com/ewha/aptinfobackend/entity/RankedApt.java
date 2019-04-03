package com.ewha.aptinfobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "apt_trxn")
public class RankedApt {
    @Id
    private int apt_code;

    @Column(name = "gu_code")
    private int gu;
    @Column(name = "trxn_y")
    private String year;
    @Column(name = "trxn_m")
    private String month;
    private String apt_nm;
    private int trxn_id;
    @Column(name = "trxn_price")
    private int price;
}
