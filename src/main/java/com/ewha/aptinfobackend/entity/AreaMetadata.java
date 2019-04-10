package com.ewha.aptinfobackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "area_info")
public class AreaMetadata {
    @Column(name = "code_p")
    private Integer parent;

    @Id
    @Column(name = "code_c")
    private Integer guCode;

    @Column(name = "area_nm")
    private String name;

}
