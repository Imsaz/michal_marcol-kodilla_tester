package com.kodilla.bank.homework;

public class Bank {

    public final CashMachine[] cashMachines = new CashMachine[3];



    public int balanceOfAllCashMachines(){
        return cashMachines[0].balanceOfCashMachine() + cashMachines[1].balanceOfCashMachine() + cashMachines[2].balanceOfCashMachine();
    }

    public int amountOfPayments(CashMachine cashMachine){
        if (cashMachine.getTransaction().length == 0){
            return 0;
        }

        int amountOfPayments = 0;
        int []transactions = cashMachine.getTransaction();
        for (int i = 0; i < cashMachine.getTransaction().length; i++) {
            if(transactions[i] >= 0)
                amountOfPayments += 1;
        }

        return amountOfPayments;
    }

    public int amountOfWithdrawals(CashMachine cashMachine){
        if (cashMachine.getTransaction().length == 0){
            return 0;
        }

        int amountOfPayments = 0;
        int []transactions = cashMachine.getTransaction();
        for (int i = 0; i < cashMachine.getTransaction().length; i++) {
            if(transactions[i] <= 0)
                amountOfPayments += 1;
        }

        return amountOfPayments;
    }

    public double averageAmountOfPayments(CashMachine cashMachine){
        if (cashMachine.getTransaction().length == 0){
            return 0;
        }

        int balanceAmountOfPayments = 0;
        int []transactions = cashMachine.getTransaction();
        for (int i = 0; i < cashMachine.getTransaction().length; i++) {
            if(transactions[i] >= 0)
                balanceAmountOfPayments += transactions[i];
        }

        return balanceAmountOfPayments/amountOfPayments(cashMachine);
    }

    public double averageAmountOfWithdrawals(CashMachine cashMachine){
        if (cashMachine.getTransaction().length == 0){
            return 0;
        }

        int balanceAmountOfWithdrawals = 0;
        int []transactions = cashMachine.getTransaction();
        for (int i = 0; i < cashMachine.getTransaction().length; i++) {
            if(transactions[i] <= 0)
                balanceAmountOfWithdrawals += transactions[i];
        }

        return balanceAmountOfWithdrawals/amountOfWithdrawals(cashMachine);
    }
}
