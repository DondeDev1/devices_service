package com.donde.qa.application.usecases;

import com.donde.qa.domain.entity.Devices;

import java.util.Date;
import java.util.List;

public interface DevicesManagementUseCase {
    
    Devices createDevic(
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
    );
    Devices updateDevice(
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
    );
    Devices persistDevice(Devices device);

    Devices GetDevice(int id);

    <T>List<T> findAllDevices();

  

}
