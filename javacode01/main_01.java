package com.java_learning.Javacode01;

public class main_01 {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        double x = 10;
        double y = 20;
        System.out.println(calculator.add(x,y));
        System.out.println(calculator.sub(x,y));
        System.out.println(calculator.mul(x,y));
        System.out.println(calculator.div(x,y));
        try {
            double result = calculator.div(10, 0); // 这里会触发异常,会跳过下面的代码
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Caught an exception: " + e.getMessage());//err与out独立的流
        }
        System.out.println(calculator.add(3,5));
    }
}
