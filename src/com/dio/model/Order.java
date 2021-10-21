package com.dio.model;

public class Order {
    private final String code;

    public Order (String code){
        this.code = code;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }
}
