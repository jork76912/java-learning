package com.java_learning.Javacode02;

public class BalanceNotEnoughException extends RuntimeException{
    public BalanceNotEnoughException(String message){
        super(message);
    }
}

// 定义基础异常类
class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}

// 定义具体异常类：资金不足
class InsufficientFundsException extends BankingException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// 定义具体异常类：负数金额操作
class NegativeAmountException extends BankingException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// 定义基础非受检异常类
class BankingRuntimeException extends RuntimeException {
    public BankingRuntimeException(String message) {
        super(message);
    }
}

// 定义具体非受检异常类：资金不足
class InsufficientFundsRuntimeException extends BankingRuntimeException {
    public InsufficientFundsRuntimeException(String message) {
        super(message);
    }
}

// 定义具体非受检异常类：负数金额操作
class NegativeAmountRuntimeException extends BankingRuntimeException {
    public NegativeAmountRuntimeException(String message) {
        super(message);
    }
}

