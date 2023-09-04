package com.donde.qa.framework.input.rest;

import com.donde.qa.application.usecases.DevicesManagementUseCase;
import com.donde.qa.framework.input.rest.request.Devices.CreateDevices;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/qa/devices")
@Tag(name = "devices operations",description = "devices management operation")
public class DevicesManagerAdapter {
    
    @Inject
    DevicesManagementUseCase devicesManagementUseCase;

    private static final Logger LOG = Logger.getLogger(DevicesManagerAdapter.class);

    @Transactional
    @GET
    // @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    @Operation(operationId = "getAllDevices",description = "get all devices")
    public Uni<Response> getAllDevices(){
        return Uni.createFrom()
                .item(devicesManagementUseCase.findAllDevices())
                .onItem()
                .transform( f -> f != null ? Response.ok(f) : Response.ok(null))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }

    @Transactional
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    @Operation(operationId = "getdevice",description = "get device")
    public Uni<Response> getDevice(@PathParam("id") int id){
        return Uni.createFrom()
                .item(devicesManagementUseCase.GetDevice(id))
                .onItem()
                .transform( f -> f != null ? Response.ok(f) : Response.ok(null))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }

    @Transactional
    @POST
    // @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(operationId = "createDevice",description = "create device")
    public Uni<Response> createDevice(CreateDevices newdevice)
    {
        var device = devicesManagementUseCase.createDevic(
                newdevice.getDeviceManufacturer(),
                newdevice.getDeviceModel(),
                newdevice.getDeviceParity(),
                newdevice.getDeviceDatabits(),
                newdevice.getDeviceBaudrate(),
                newdevice.getDeviceStopbits(),
                newdevice.getDeviceHandshake(),
                newdevice.getDeviceExtractRegex(),
                newdevice.getDeviceExtractGroup(),
                newdevice.getCreatedAt(),
                newdevice.getModifiedAt(),
                newdevice.getIsEnabled(),
                newdevice.getMeasurementThreshold()
        );
        
        return Uni.createFrom()
                .item(devicesManagementUseCase.persistDevice(device))
                .onItem()
                .transform( f -> f != null ? Response.ok(f) : Response.ok(null))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }

    @Transactional
    @PUT
    // @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(operationId = "updateDevice",description = "update device")
    public Uni<Response> updateDevice(CreateDevices newdevice)
    {
        var device = devicesManagementUseCase.updateDevice(
                newdevice.getId(),
                newdevice.getDeviceManufacturer(),
                newdevice.getDeviceModel(),
                newdevice.getDeviceParity(),
                newdevice.getDeviceDatabits(),
                newdevice.getDeviceBaudrate(),
                newdevice.getDeviceStopbits(),
                newdevice.getDeviceHandshake(),
                newdevice.getDeviceExtractRegex(),
                newdevice.getDeviceExtractGroup(),
                newdevice.getCreatedAt(),
                newdevice.getModifiedAt(),
                newdevice.getIsEnabled(),
                newdevice.getMeasurementThreshold()
        );
        
        return Uni.createFrom()
                .item(devicesManagementUseCase.persistDevice(device))
                .onItem()
                .transform( f -> f != null ? Response.ok(f) : Response.ok(null))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }

}
