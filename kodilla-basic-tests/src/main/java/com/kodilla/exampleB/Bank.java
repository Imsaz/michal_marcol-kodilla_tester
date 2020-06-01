package com.kodilla.exampleB;

public class Bank {

    public CashMachine planetCash;// = new CashMachine(CashMachine.CashMachineType.planetCash);
    public CashMachine euronet;// = new CashMachine(CashMachine.CashMachineType.euronet);
    public CashMachine ING; //= new CashMachine(CashMachine.CashMachineType.ING);

    public Bank() {
        planetCash = new CashMachine(CashMachine.CashMachineType.PLANET_CASH);
        euronet = new CashMachine(CashMachine.CashMachineType.EURONET);
        ING = new CashMachine(CashMachine.CashMachineType.ING);
    }

    public int getBalanceFromAllCashMachine() {
        return planetCash.balanceAfterTransactions() + euronet.balanceAfterTransactions() + ING.balanceAfterTransactions();
    }

    public int numberOfPaymentTransactions() {
        int numberOfPayment1 = 0;
        int numberOfPayment2 = 0;
        int numberOfPayment3 = 0;

        for (int payment : euronet.getTransaction()
        ) {
            if (payment > 0)
                numberOfPayment1++;
        }

        for (int payment : planetCash.getTransaction()
        ) {
            if (payment > 0)
                numberOfPayment2++;
        }

        for (int payment : ING.getTransaction()
        ) {
            if (payment > 0)
                numberOfPayment3++;
        }

        return numberOfPayment1 + numberOfPayment2 + numberOfPayment3;
    }

    public int numberOfWithdrawTransactions() {
        int numberOfPayment1 = 0;
        int numberOfPayment2 = 0;
        int numberOfPayment3 = 0;

        int sum1 = 0;

        for (int payment : euronet.getTransaction()
        ) {
            if (payment < 0)
                numberOfPayment1++;
        }

        for (int payment : planetCash.getTransaction()
        ) {
            if (payment < 0)
                numberOfPayment2++;
        }

        for (int payment : ING.getTransaction()
        ) {
            if (payment < 0)
                numberOfPayment3++;
        }

        return numberOfPayment1 + numberOfPayment2 + numberOfPayment3;
    }

    public double getAverageOfPayment() {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int numberOfPayment1 = 0;
        int numberOfPayment2 = 0;
        int numberOfPayment3 = 0;

        if (planetCash.getTransaction().length != 0) {
            for (int i = 0; i < planetCash.getTransaction().length; i++) {
                if (planetCash.getTransaction()[i] > 0) {
                    sum1 += planetCash.getTransaction()[i];
                    numberOfPayment1++;
                }
            }
        }

        if (euronet.getTransaction().length != 0) {
            for (int i = 0; i < euronet.getTransaction().length; i++) {
                if (euronet.getTransaction()[i] > 0) {
                    sum1 += euronet.getTransaction()[i];
                    numberOfPayment2++;
                }
            }
        }

        if (ING.getTransaction().length != 0) {
            for (int i = 0; i < ING.getTransaction().length; i++) {
                if (ING.getTransaction()[i] > 0) {
                    sum3 += ING.getTransaction()[i];
                    numberOfPayment3++;
                }
            }
        }
        return (sum1 + sum2 + sum3) / (numberOfPayment1 + numberOfPayment2 + numberOfPayment3);
    }

    public double getAverageOfWithdraw() {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int numberOfPayment1 = 0;
        int numberOfPayment2 = 0;
        int numberOfPayment3 = 0;

        if (planetCash.getTransaction().length != 0) {
            for (int i = 0; i < planetCash.getTransaction().length; i++) {
                if (planetCash.getTransaction()[i] < 0) {
                    sum1 += planetCash.getTransaction()[i];
                    numberOfPayment1++;
                }
            }
        }

        if (euronet.getTransaction().length != 0) {
            for (int i = 0; i < euronet.getTransaction().length; i++) {
                if (euronet.getTransaction()[i] < 0) {
                    sum1 += euronet.getTransaction()[i];
                    numberOfPayment2++;
                }
            }
        }

        if (ING.getTransaction().length != 0) {
            for (int i = 0; i < ING.getTransaction().length; i++) {
                if (ING.getTransaction()[i] < 0) {
                    sum3 += ING.getTransaction()[i];
                    numberOfPayment3++;
                }
            }
        }
        return (sum1 + sum2 + sum3) / (numberOfPayment1 + numberOfPayment2 + numberOfPayment3);
    }
}


