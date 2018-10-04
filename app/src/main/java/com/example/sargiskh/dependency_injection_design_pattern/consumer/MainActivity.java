package com.example.sargiskh.dependency_injection_design_pattern.consumer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.service_injector.EmailServiceInjector;
import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.service_injector.MessageServiceInjector;
import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.service_injector.SMSServiceInjector;
import com.example.sargiskh.dependency_injection_design_pattern.R;
import com.example.sargiskh.dependency_injection_design_pattern.version_1__message_application.application.Consumer;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.Cart;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.PaymentServiceFactory;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.PaymentService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        version_1();
        version_2();
    }

    private void version_1() {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";

        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send Email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();

        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

    private void version_2() {
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("CARD");
        Cart cart = new Cart(paymentService);
    }

}