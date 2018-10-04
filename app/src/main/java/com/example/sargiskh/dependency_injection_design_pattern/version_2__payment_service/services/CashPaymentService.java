package com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services;

import android.util.Log;

import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.Product;

public class CashPaymentService implements PaymentService {
    @Override
    public void pay(Product product) {
        Log.e("LOG_TAG","Payed with cash");
    }
}
