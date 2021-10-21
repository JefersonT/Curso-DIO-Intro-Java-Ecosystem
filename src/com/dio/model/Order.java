package com.dio.model;

import java.math.BigDecimal; //importanto classes necessárias

public class Order {
/*
    //BigDecimal--------------------------------------------------------
    // atributos
    private final String code;
    private final BigDecimal totalValue;
    // métodos
    public Order (String code, BigDecimal totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    public BigDecimal calculateFee(){
        return this.totalValue.multiply(new BigDecimal("0.99"));
    }
    */

/*
    //if-else------------------------------------------------------------
    // atributos
    private final String code;
    private final double totalValue;
    // métodos
    public Order (String code, double totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    //Estrutura de condicional if-else
    public double calculateFee(){
        if (totalValue > 100){
            return totalValue * 0.99;
        } else {
            return totalValue;
        }
    }
    */

    //switch-case------------------------------------------------------------
    // atributos
    private final String code;
    private final int totalValue;


    private String[] itens;

    // métodos
    public Order (String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    //Estrutura de switch-case
    public double calculateFee(){
        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }
/*
    //while--------------------
    public void printItem(){
        int i = 0;
        while (i < itens.length){
            System.out.println(itens[i]);
            i++;
        }
    }
    */

/*
    //do-while---------------------------
    public void printItem() {
        int i = 0;

        do {
            System.out.println(itens[i]);
        } while (i < itens.length);
    }
    */

/*
    //for------------------------------
    public void printItem() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i]);
        }
    }
*/


    //enchanced for --------------------------------------------
    public void printItem(){
        for (String i : itens){
            System.out.println(i);
        }
    }


}
