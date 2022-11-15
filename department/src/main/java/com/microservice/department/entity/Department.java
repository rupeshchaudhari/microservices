package com.microservice.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
