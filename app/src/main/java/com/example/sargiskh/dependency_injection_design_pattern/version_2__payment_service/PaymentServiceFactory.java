package com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service;

import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.CardPaymentService;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.CashPaymentService;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.PaymentService;
import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.TestPaymentService;

public class PaymentServiceFactory {

    public static PaymentService getPaymentService(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("CASH")) {
            return new CashPaymentService();
        }
        if (paymentType.equalsIgnoreCase("CARD")) {
            return new CardPaymentService();
        }
        if (paymentType.equalsIgnoreCase("TEST")) {
            return new TestPaymentService();
        }
        return null;
    }

}
