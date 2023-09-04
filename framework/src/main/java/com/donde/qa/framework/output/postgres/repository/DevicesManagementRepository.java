package com.donde.qa.framework.output.postgres.repository;

import com.donde.qa.framework.output.postgres.data.DevicesData;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DevicesManagementRepository implements PanacheRepositoryBase<DevicesData,Long> {
    
}
