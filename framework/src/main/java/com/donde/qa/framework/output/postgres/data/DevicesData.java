package com.donde.qa.framework.output.postgres.data;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "DevicesData")
@Table(name = "devices")
public class DevicesData implements Serializable  {
   
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "devices_id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "device_manufacturer", nullable = false, length = 2147483647)
    private String deviceManufacturer;

    @Basic(optional = false)
    @Column(name = "device_model", nullable = false, length = 2147483647)
    private String deviceModel;

    @Basic(optional = false)
    @Column(name = "device_parity", nullable = false)
    private int deviceParity;

    @Basic(optional = false)
    @Column(name = "device_databits", nullable = false)
    private int deviceDatabits;

    @Basic(optional = false)
    @Column(name = "device_baudrate", nullable = false)
    private int deviceBaudrate;

    @Basic(optional = false)
    @Column(name = "device_stopbits", nullable = false)
    private int deviceStopbits;

    @Basic(optional = false)
    @Column(name = "device_handshake", nullable = false)
    private int deviceHandshake;

    @Basic(optional = false)
    @Column(name = "device_extract_regex", nullable = false, length = 2147483647)
    private String deviceExtractRegex; 

    @Basic(optional = false)
    @Column(name = "device_extract_group", nullable = false, length = 2147483647)
    private String deviceExtractGroup; 

    @Basic(optional = false)
    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt; 

    @Basic(optional = false)
    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Basic(optional = false)
    @Column(name = "is_enabled", nullable = false)
    private Boolean isEnabled;

    @Basic(optional = false)
    @Column(name = "measurement_threshold", nullable = false)
    private int measurementThreshold;

    public DevicesData (String deviceManufacturer,String deviceModel,int deviceParity,int deviceDatabits,int deviceBaudrate, int deviceStopbits,int deviceHandshake, String deviceExtractRegex, String deviceExtractGroup, Date createdAt, Date modifiedAt, Boolean isEnabled, int measurementThreshold){
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
