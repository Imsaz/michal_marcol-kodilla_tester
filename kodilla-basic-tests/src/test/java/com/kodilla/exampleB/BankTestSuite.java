package com.kodilla.exampleB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateBalanceFromAllMachines() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(100);
        cashMachine.ING.addTransaction(100);

        assertEquals(1000, cashMachine.getBalanceFromAllCashMachine());
    }

    @Test
    public void shouldCalculateBalanceFromAllMachinesWhenUseOnlyTwo() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.ING.addTransaction(100);
        cashMachine.ING.addTransaction(100);

        assertEquals(1000, cashMachine.getBalanceFromAllCashMachine());
    }

    @Test
    public void shouldCalculateNumberOfPaymentTransaction() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(100);
        cashMachine.ING.addTransaction(100);

        assertEquals(5, cashMachine.numberOfPaymentTransactions());
    }

    @Test
    public void shouldCalculateNumberOfWithdrawTransaction() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(100);
        cashMachine.ING.addTransaction(100);

        assertEquals(1, cashMachine.numberOfWithdrawTransactions());
    }

    @Test
    public void shouldCalculateAverageOfPaymentTransaction() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(100);
        cashMachine.ING.addTransaction(100);

        assertEquals(240, cashMachine.getAverageOfPayment());
    }

    @Test
    public void shouldCalculateAverageOfWithdrawTransaction() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(-500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(-200);
        cashMachine.ING.addTransaction(100);

        assertEquals(-300, cashMachine.getAverageOfWithdraw());
    }

    @Test
    public void shouldCalculateAverageOfPaymentTransactionWhenUseOnlyTwo() {
        Bank cashMachine = new Bank();

        cashMachine.euronet.addTransaction(200);
        cashMachine.euronet.addTransaction(-200);

        cashMachine.ING.addTransaction(500);
        cashMachine.ING.addTransaction(200);

        assertEquals(300, cashMachine.getAverageOfPayment());
    }

    @Test
    public void shouldCalculateAverageOfWithdrawTransactionWhenUseOnlyTwo() {
        Bank cashMachine = new Bank();

        cashMachine.planetCash.addTransaction(-500);
        cashMachine.planetCash.addTransaction(300);

        cashMachine.ING.addTransaction(-200);
        cashMachine.ING.addTransaction(100);

        assertEquals(-350, cashMachine.getAverageOfWithdraw());
    }
}
