import com.donde.qa.framework.output.postgres.DevicesManagementPostgresAdapter;

module framework {
    requires domain;
    requires application;
    requires static lombok;

    requires java.sql;
    requires java.persistence;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires jakarta.enterprise.cdi.api;
    requires jakarta.inject.api;
    requires java.ws.rs;
    requires io.smallrye.mutiny;
    requires java.xml.bind;
    requires smallrye.common.annotation;
    requires com.fasterxml.jackson.annotation;
    requires quarkus.hibernate.orm.panache;
    requires java.transaction;
    requires io.vertx.core;
    requires microprofile.context.propagation.api;
    requires microprofile.openapi.api;
    requires microprofile.rest.client.api;
    requires org.jboss.logging;
    requires jbcrypt;
    requires quarkus.panache.common;

    uses com.donde.qa.application.usecases.DevicesManagementUseCase;
    uses com.donde.qa.application.ports.output.DevicesManagementOutputPort;

    exports  com.donde.qa.framework.output.postgres.data;
    opens com.donde.qa.framework.output.postgres.data;

    exports com.donde.qa.framework.output.postgres.repository;
    opens com.donde.qa.framework.output.postgres.repository;

    provides com.donde.qa.application.ports.output.DevicesManagementOutputPort with DevicesManagementPostgresAdapter;


}