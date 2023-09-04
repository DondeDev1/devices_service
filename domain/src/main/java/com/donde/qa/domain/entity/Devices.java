package com.donde.qa.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Devices {
    
    private int id;

    private String deviceManufacturer;

    private String deviceModel;

    private int deviceParity;

    private int deviceDatabits;

    private int deviceBaudrate;

    private int deviceStopbits;

    private int deviceHandshake;

    private String deviceExtractRegex; 

    private String deviceExtractGroup; 

    private Date createdAt; 

    private Date modifiedAt;

    private Boolean isEnabled;

    private int measurementThreshold;

        public Devices (String deviceManufacturer,String deviceModel,int deviceParity,int deviceDatabits,int deviceBaudrate, int deviceStopbits,int deviceHandshake, String deviceExtractRegex, String deviceExtractGroup, Date createdAt, Date modifiedAt, Boolean isEnabled, int measurementThreshold){
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.deviceParity = deviceParity;
        this.deviceDatabits = deviceDatabits;
        this.deviceBaudrate = deviceBaudrate;
        this.deviceStopbits = deviceStopbits;
        this.deviceHandshake = deviceHandshake;
        this.deviceExtractRegex = deviceExtractRegex;
        this.deviceExtractGroup = deviceExtractGroup;
        this.createdAt = createdAt;
        this.modifiedAt =modifiedAt;
        this.isEnabled = isEnabled;
        this.measurementThreshold = measurementThreshold;
    }
}
