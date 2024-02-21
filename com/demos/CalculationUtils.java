package com.demos;

public class CalculationUtils {

    public double calculateDiscount(double price, double discount) {
        return price * discount / 100;
    }

    public double calculateTax(double price, double tax) {
        return price * tax / 100;
    }

    public double calculateTotalPrice(double price, double discount, double tax) {
        return price - calculateDiscount(price, discount) + calculateTax(price, tax);
    }
}
