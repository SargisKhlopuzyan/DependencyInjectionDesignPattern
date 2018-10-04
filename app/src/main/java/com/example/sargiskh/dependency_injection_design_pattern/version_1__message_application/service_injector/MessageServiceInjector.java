package com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.service_injector;

import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.application.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}