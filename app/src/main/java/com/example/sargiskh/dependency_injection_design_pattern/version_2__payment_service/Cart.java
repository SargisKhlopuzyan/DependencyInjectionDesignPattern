package com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service;

import com.example.sargiskh.dependency_injection_design_pattern.version_2__payment_service.services.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productList = new ArrayList< >();


    private PaymentService paymentService;

    public Cart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    public void addProductToCart(Product product) {
        productList.add(product);
    }

    public void buy() {
//        productList.stream().forEach(paymentService::pay);
        productList.forEach(product -> paymentService.pay(product));
    }

}
