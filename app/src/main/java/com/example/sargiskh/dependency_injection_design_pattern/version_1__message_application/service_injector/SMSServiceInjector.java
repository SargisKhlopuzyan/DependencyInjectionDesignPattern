package com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.service_injector;

import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.application.Consumer;
import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.application.MyDIApplication;
import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.message_service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}