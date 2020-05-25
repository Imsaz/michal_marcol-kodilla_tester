package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transaction;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transaction = new int[0];
    }

    public void addCash (int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction,0,newTab,0,transaction.length);
        newTab[this.size - 1] = value;
        this.transaction = newTab;
    }

    public int[] getTransaction() {
        return transaction;
    }

    public int numberOfTransactions (){
        return transaction.length;
    }

    public int balanceOfCashMachine (){
        if (this.transaction.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            sum += this.transaction[i];
        }

        return sum;
    }

}
