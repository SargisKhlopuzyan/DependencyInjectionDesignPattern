package com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.application;

import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.message_service.MessageService;

public class MyDIApplication implements Consumer {

    private MessageService messageService;

    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        messageService.sendMessage(msg, rec);
    }

}
