package com.kodilla.exampleB;

public class CashMachine {

    private CashMachineType name;

    private int[] transaction;
    private int balance;
    private int size;

    public enum CashMachineType {
        EURONET, PLANET_CASH, ING
    }

    public CashMachine(CashMachineType cashMachineType) {
        this.name = cashMachineType;
        this.size = 0;
        this.transaction = new int[0];
        this.balance = 0;
    }

    public int numberOfTransactions() {
        return this.transaction.length;
    }

    public int balanceAfterTransactions() {

        for (int transaction : transaction)
            balance += transaction;
        return balance;
    }

    public void addTransaction(int newTransaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[size - 1] = newTransaction;
        this.transaction = newTab;
    }

    public int[] getTransaction() {
        return transaction;
    }

    public int balance() {
        return balance;
    }

}
