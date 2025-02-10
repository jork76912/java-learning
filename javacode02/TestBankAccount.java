package com.java_learning.Javacode02;

public class TestBankAccount {
    public static void main(String[] args){
      //  try {
            BankAccount account = new BankAccount(1000);

            System.out.println("Initial Balance: " + account.getBalance());

            // 存款测试
            account.deposit(500);
            System.out.println("After Deposit: " + account.getBalance());

            // 取款测试
            account.withdraw(200);
            System.out.println("After Withdrawal: " + account.getBalance());

            // 尝试取出过多的资金
        try {
            account.withdraw(2000);

        } catch (InsufficientFundsRuntimeException e) {
            System.err.println("Insufficient Funds Exception: " + e.getMessage());
        } catch (NegativeAmountRuntimeException e) {
            System.err.println("Negative Amount Exception: " + e.getMessage());
        }
        System.out.println("你好");

    }
}
