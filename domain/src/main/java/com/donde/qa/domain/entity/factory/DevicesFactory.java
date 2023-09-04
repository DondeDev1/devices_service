package com.donde.qa.domain.entity.factory;

import com.donde.qa.domain.entity.Devices;

import java.util.Date;

public class DevicesFactory {
    public static Devices getDevices(
        int id,

        String deviceManufacturer,
    
        String deviceModel,
    
        int deviceParity,
    
        int deviceDatabits,
    
        int deviceBaudrate,
    
        int deviceStopbits,
    
        int deviceHandshake,
    
        String deviceExtractRegex, 
    
        String deviceExtractGroup, 
    
        Date createdAt, 
    
        Date modifiedAt,
    
        Boolean isEnabled,
    
        int measurementThreshold
    ){
        return Devices.builder()
                .id(id)
                .deviceManufacturer(deviceManufacturer)
                .deviceModel(deviceModel)
                .deviceParity(deviceParity)
                .deviceDatabits(deviceDatabits)
                .deviceBaudrate(deviceBaudrate)
                .deviceStopbits(deviceStopbits)
                .deviceHandshake(deviceHandshake)
                .deviceExtractRegex(deviceExtractRegex)
                .deviceExtractGroup(deviceExtractGroup)
                .createdAt(createdAt)
                .modifiedAt(modifiedAt)
                .isEnabled(isEnabled)
                .measurementThreshold(measurementThreshold)
                .build();
    }
    public static Devices getDevices(

        String deviceManufacturer,
    
        String deviceModel,
    
        int deviceParity,
    
        int deviceDatabits,
    
        int deviceBaudrate,
    
        int deviceStopbits,
    
        int deviceHandshake,
    
        String deviceExtractRegex, 
    
        String deviceExtractGroup, 
    
        Date createdAt, 
    
        Date modifiedAt,
    
        Boolean isEnabled,
    
        int measurementThreshold
    ){
        return Devices.builder()
                .deviceManufacturer(deviceManufacturer)
                .deviceModel(deviceModel)
                .deviceParity(deviceParity)
                .deviceDatabits(deviceDatabits)
                .deviceBaudrate(deviceBaudrate)
                .deviceStopbits(deviceStopbits)
                .deviceHandshake(deviceHandshake)
                .deviceExtractRegex(deviceExtractRegex)
                .deviceExtractGroup(deviceExtractGroup)
                .createdAt(createdAt)
                .modifiedAt(modifiedAt)
                .isEnabled(isEnabled)
                .measurementThreshold(measurementThreshold)
                .build();
    }
}
