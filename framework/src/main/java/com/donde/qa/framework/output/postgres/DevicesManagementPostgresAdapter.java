package com.donde.qa.framework.output.postgres;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.donde.qa.application.ports.output.DevicesManagementOutputPort;
import com.donde.qa.domain.entity.Devices;
import com.donde.qa.framework.output.postgres.data.DevicesData;
import com.donde.qa.framework.output.postgres.mappers.DevicesMapper;
import com.donde.qa.framework.output.postgres.repository.DevicesManagementRepository;
import org.jboss.logging.Logger;

@ApplicationScoped
public class DevicesManagementPostgresAdapter implements DevicesManagementOutputPort {

    @Inject
    DevicesManagementRepository devicesManagementRepository;
    private static final Logger LOG = Logger.getLogger(DevicesManagementPostgresAdapter.class);

    @Override
    public List<DevicesData> findAllDevices() {
        List<DevicesData> findIt;
        try {
            findIt = devicesManagementRepository.findAll().list();
            return findIt;
        } catch (Exception ex) {
            LOG.error("Error al buscar los dispositivos" + ex.getMessage());
            return null;
        }
    }

    @Override
    public Devices GetDevice(int id) {
        try {
            DevicesData device = devicesManagementRepository.find("devices_id = " + id).firstResult();
            Devices Devic = DevicesMapper.devicesToDomain(device);
            return Devic;
        } catch (Exception ex) {
            LOG.error("Error al buscar dispositivo " + ex.getMessage());
            return null;
        }

    }

    @Override
    public Devices persistDevice(Devices device) {
        try {
            var deviceForSave = DevicesMapper.devicesDomainToDataWithOutId(device);
            if(device.getId() == 0){       
                devicesManagementRepository.persist(deviceForSave);
                DevicesData devicesave = devicesManagementRepository.find("deviceManufacturer = ?1 AND deviceModel = ?2",device.getDeviceManufacturer(),device.getDeviceModel()).firstResult();
                Devices devic = DevicesMapper.devicesToDomain(devicesave);
                return devic;
            }
            else
            {
            DevicesData findDevice = devicesManagementRepository.find("devices_id = "+device.getId()).firstResult();
            findDevice.setDeviceManufacturer(device.getDeviceManufacturer());
            findDevice.setDeviceModel(device.getDeviceModel());
            findDevice.setDeviceParity(device.getDeviceParity());
            findDevice.setDeviceDatabits(device.getDeviceDatabits());
            findDevice.setDeviceBaudrate(device.getDeviceBaudrate());
            findDevice.setDeviceStopbits(device.getDeviceStopbits());
            findDevice.setDeviceHandshake(device.getDeviceHandshake());
            findDevice.setDeviceExtractRegex(device.getDeviceExtractRegex());
            findDevice.setDeviceExtractGroup(device.getDeviceExtractGroup());
            findDevice.setIsEnabled(device.getIsEnabled());
            findDevice.setMeasurementThreshold(device.getMeasurementThreshold());
            findDevice.setModifiedAt(device.getModifiedAt());

            devicesManagementRepository.persist(findDevice);
            return device;
            }

        } catch (Exception ex) {
            LOG.error("Error al guardar dispositivo " + ex.getMessage());
            return null;
        }
    }

}
