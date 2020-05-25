package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength(){
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransaction();
        assertEquals(0, transaction.length);
    }

    @Test
    public void shouldAddThreeElementsToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addCash(300);
        cashMachine.addCash(0);
        cashMachine.addCash(-500);

        int[] transaction = cashMachine.getTransaction();
        assertEquals(3, transaction.length);
        assertEquals(300, transaction[0]);
        assertEquals(0, transaction[1]);
        assertEquals(-500, transaction[2]);
    }

    @Test
    public void shouldReturnNumberOfTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addCash(300);
        cashMachine.addCash(0);
        cashMachine.addCash(-500);

        int[] transaction = cashMachine.getTransaction();
        assertEquals(3, transaction.length);
    }

    @Test
    public void shouldReturn0IfTransactionArrayIsEmpty(){
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransaction();
        assertEquals(0, transaction.length);
    }

    @Test
    public void balanceOfCashMachine(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addCash(300);
        cashMachine.addCash(100);
        cashMachine.addCash(-500);

        int[] transaction = cashMachine.getTransaction();
        assertEquals(-100, cashMachine.balanceOfCashMachine());
    }

}
