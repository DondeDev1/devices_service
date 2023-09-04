package com.donde.qa.application.ports.input;

import java.util.Date;
import java.util.List;

import com.donde.qa.application.ports.output.DevicesManagementOutputPort;
import com.donde.qa.application.usecases.DevicesManagementUseCase;
import com.donde.qa.domain.entity.Devices;
import com.donde.qa.domain.entity.factory.DevicesFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DevicesManagementInputPort implements DevicesManagementUseCase{

    @Inject
    DevicesManagementOutputPort devicesManagementOutputPort;

    @Override
    public Devices createDevic(String deviceManufacturer, String deviceModel, int deviceParity,
            int deviceDatabits, int deviceBaudrate, int deviceStopbits, int deviceHandshake, String deviceExtractRegex,
            String deviceExtractGroup, Date createdAt, Date modifiedAt, Boolean isEnabled, int measurementThreshold) {
        return DevicesFactory.getDevices(deviceManufacturer, deviceModel, deviceParity, deviceDatabits, deviceBaudrate, deviceStopbits, deviceHandshake, deviceExtractRegex, deviceExtractGroup, createdAt, modifiedAt, isEnabled, measurementThreshold);
    }
    
    @Override
    public Devices updateDevice(int id, String deviceManufacturer, String deviceModel, int deviceParity,
            int deviceDatabits, int deviceBaudrate, int deviceStopbits, int deviceHandshake, String deviceExtractRegex,
            String deviceExtractGroup, Date createdAt, Date modifiedAt, Boolean isEnabled, int measurementThreshold) {
        return DevicesFactory.getDevices(id, deviceManufacturer, deviceModel, deviceParity, deviceDatabits, deviceBaudrate, deviceStopbits, deviceHandshake, deviceExtractRegex, deviceExtractGroup, createdAt, modifiedAt, isEnabled, measurementThreshold);
    }

    @Override
    public Devices GetDevice(int id) {
        return devicesManagementOutputPort.GetDevice(id);
    }

    @Override
    public <T> List<T> findAllDevices() {
        return devicesManagementOutputPort.findAllDevices();
    }

    @Override
    public Devices persistDevice(Devices device) {
        return devicesManagementOutputPort.persistDevice(device);
    }

    
}
