package com.wawa.helloworld;

public class Calculator {
    public double add(double x,double y){
        return x+y;
    }

    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y){
        return x*y;
    }
    public double div(double x, double y) throws ArithmeticException{
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x/y;
    }
}
