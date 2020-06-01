package com.kodilla.exampleB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(CashMachine.CashMachineType.EURONET);
        int[] transaction = cashMachine.getTransaction();
        assertEquals(0, transaction.length);
    }

    @Test
    public void shouldCalculateNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine(CashMachine.CashMachineType.PLANET_CASH);

        cashMachine.addTransaction(500);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-500);

        int numberOfTransaction = cashMachine.numberOfTransactions();
        assertEquals(4, numberOfTransaction);
    }

    @Test
    public void shouldCalculateBalanceAfterTransactionWhenIsPositive() {
        CashMachine cashMachine = new CashMachine(CashMachine.CashMachineType.PLANET_CASH);

        cashMachine.addTransaction(500);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-500);

        int balance = cashMachine.balanceAfterTransactions();
        assertEquals(800, balance);
    }

    @Test
    public void shouldCalculateBalanceAfterTransactionWhenIsNegative() {
        CashMachine cashMachine = new CashMachine(CashMachine.CashMachineType.PLANET_CASH);

        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-500);

        int balanceAfterTransactions = cashMachine.balanceAfterTransactions();
        assertEquals(-300, balanceAfterTransactions);
    }
}
