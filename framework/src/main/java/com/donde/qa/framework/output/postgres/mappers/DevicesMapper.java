package com.donde.qa.framework.output.postgres.mappers;

import com.donde.qa.domain.entity.Devices;
import com.donde.qa.domain.entity.factory.DevicesFactory;
import com.donde.qa.framework.output.postgres.data.DevicesData;

public class DevicesMapper {
    public static Devices devicesToDomain(DevicesData devicesData) {
        var devices = DevicesFactory.getDevices(
                devicesData.getId(),
                devicesData.getDeviceManufacturer(),
                devicesData.getDeviceModel(),
                devicesData.getDeviceParity(),
                devicesData.getDeviceDatabits(),
                devicesData.getDeviceBaudrate(),
                devicesData.getDeviceStopbits(),
                devicesData.getDeviceHandshake(),
                devicesData.getDeviceExtractRegex(),
                devicesData.getDeviceExtractGroup(),
                devicesData.getCreatedAt(),
                devicesData.getModifiedAt(),
                devicesData.getIsEnabled(),
                devicesData.getMeasurementThreshold()

        );
        return devices;
    }

    public static DevicesData devicesDomainToData(Devices devices) {
        var devicesData = DevicesData.builder()
                .id(devices.getId()).deviceManufacturer(devices.getDeviceManufacturer())
                .deviceModel(devices.getDeviceModel())
                .deviceParity(devices.getDeviceParity())
                .deviceDatabits(devices.getDeviceDatabits())
                .deviceBaudrate(devices.getDeviceBaudrate())
                .deviceStopbits(devices.getDeviceStopbits())
                .deviceHandshake(devices.getDeviceHandshake())
                .deviceExtractRegex(devices.getDeviceExtractRegex())
                .deviceExtractGroup(devices.getDeviceExtractGroup())
                .createdAt(devices.getCreatedAt())
                .modifiedAt(devices.getModifiedAt())
                .isEnabled(devices.getIsEnabled())
                .measurementThreshold(devices.getMeasurementThreshold())
                .build();

        return devicesData;
    }
    public static Devices devicesToDomainWithOutId(DevicesData devicesData) {
            var devices = DevicesFactory.getDevices(
                    devicesData.getDeviceManufacturer(),
                    devicesData.getDeviceModel(),
                    devicesData.getDeviceParity(),
                    devicesData.getDeviceDatabits(),
                    devicesData.getDeviceBaudrate(),
                    devicesData.getDeviceStopbits(),
                    devicesData.getDeviceHandshake(),
                    devicesData.getDeviceExtractRegex(),
                    devicesData.getDeviceExtractGroup(),
                    devicesData.getCreatedAt(),
                    devicesData.getModifiedAt(),
                    devicesData.getIsEnabled(),
                    devicesData.getMeasurementThreshold()

            );
            return devices;
        }
    public static DevicesData devicesDomainToDataWithOutId(Devices devices) {
        var devicesData = DevicesData.builder()
                .deviceManufacturer(devices.getDeviceManufacturer())
                .deviceModel(devices.getDeviceModel())
                .deviceParity(devices.getDeviceParity())
                .deviceDatabits(devices.getDeviceDatabits())
                .deviceBaudrate(devices.getDeviceBaudrate())
                .deviceStopbits(devices.getDeviceStopbits())
                .deviceHandshake(devices.getDeviceHandshake())
                .deviceExtractRegex(devices.getDeviceExtractRegex())
                .deviceExtractGroup(devices.getDeviceExtractGroup())
                .createdAt(devices.getCreatedAt())
                .modifiedAt(devices.getModifiedAt())
                .isEnabled(devices.getIsEnabled())
                .measurementThreshold(devices.getMeasurementThreshold())
                .build();

        return devicesData;
    }
}
