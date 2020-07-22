package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Account dansAccount = new Account("Dan");
        dansAccount.deposit(1000);
        dansAccount.withdraw(500);
        dansAccount.withdraw(-200);
        dansAccount.deposit(-20);
        dansAccount.calculateBalance();
        dansAccount.balance = 5000;

        System.out.println("Balance on account is " + dansAccount.getBalance());
        dansAccount.transactions.add(4500);
        dansAccount.calculateBalance();
    }
}
