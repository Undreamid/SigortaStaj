package com.tahapamuk.priminfo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "priminfo")
public class PrimInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "name")
    private String name;

    @Column(name= "age")
    private Integer age;

    @Column(name= "city")
    private String city;

    @Column(name= "income")
    private Double income;

    @Column(name= "license_age")
    private Integer licenseAge;

    @Column(name= "accident_record")
    private Integer accidentRecord;

    @Column(name= "vehicle_brand")
    private String vehicleBrand;

    @Column(name= "vehicle_plate")
    private String vehiclePlate;

    @Column(name= "vehicle_age")
    private Integer vehicleAge;

    @Column(name= "vehicle_accident_record")
    private Integer vehicleAccidentRecord;

    @Column(name= "vehicle_accident_value")
    private Double vehicleAccidentValue;

}




