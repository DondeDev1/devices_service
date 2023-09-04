package com.donde.qa.application.ports.output;

import java.util.List;

import com.donde.qa.domain.entity.Devices;

public interface DevicesManagementOutputPort {

    Devices persistDevice(Devices device);

    Devices GetDevice(int id);

    <T>List<T> findAllDevices();


}
