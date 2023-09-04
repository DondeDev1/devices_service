module application {

    exports com.donde.qa.application.usecases;
    exports com.donde.qa.application.ports.input;
    exports com.donde.qa.application.ports.output;

    requires domain;
    requires static lombok;
    requires jakarta.enterprise.cdi.api;
    requires jakarta.inject.api;
    requires arc;

    provides com.donde.qa.application.usecases.DevicesManagementUseCase
            with com.donde.qa.application.ports.input.DevicesManagementInputPort;

}