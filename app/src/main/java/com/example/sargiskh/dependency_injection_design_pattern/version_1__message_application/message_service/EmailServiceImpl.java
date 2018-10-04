package com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.message_service;

import android.util.Log;

public class EmailServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        Log.e("LOG_TAG","Email sent to " + rec + " with Message = " + msg);
    }

}
