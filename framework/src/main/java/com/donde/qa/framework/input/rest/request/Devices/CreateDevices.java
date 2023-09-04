package com.donde.qa.framework.input.rest.request.Devices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CreateDevices {
    
    @JsonProperty
    private int id;

    @JsonProperty
    private String deviceManufacturer;

    @JsonProperty
    private String deviceModel;

    @JsonProperty
    private int deviceParity;

    @JsonProperty
    private int deviceDatabits;

    @JsonProperty
    private int deviceBaudrate;

    @JsonProperty
    private int deviceStopbits;

    @JsonProperty
    private int deviceHandshake;

    @JsonProperty
    private String deviceExtractRegex; 

    @JsonProperty
    private String deviceExtractGroup; 

    @JsonProperty
    private Date createdAt; 

    @JsonProperty
    private Date modifiedAt;

    @JsonProperty
    private Boolean isEnabled;

    @JsonProperty
    private int measurementThreshold; 

    public CreateDevices (String deviceManufacturer,String deviceModel,int deviceParity,int deviceDatabits,int deviceBaudrate, int deviceStopbits,int deviceHandshake, String deviceExtractRegex, String deviceExtractGroup, Date createdAt, Date modifiedAt, Boolean isEnabled, int measurementThreshold){
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
