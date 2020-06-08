package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Integer> transaction;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transaction = new ArrayList<>();
    }

    public List<Integer> getTransaction() {
        return transaction;
    }

    public void addCash (int value) {
        transaction.add(value);
    }

    public int balanceOfCashMachine (){
        if (this.transaction.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transaction.size(); i++) {
            sum += this.transaction.get(i);
        }

        return sum;
    }

}
