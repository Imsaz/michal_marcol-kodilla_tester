package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void balanceOfAllCashMachines(){
        Bank bank = new Bank();

        bank.cashMachines[0].addCash(100);
        bank.cashMachines[1].addCash(200);
        bank.cashMachines[2].addCash(300);
        assertEquals(600,bank.balanceOfAllCashMachines());
    }

   /* @Test
    public void balanceOfAllCashMachinesWhenOneIsConstant(){
        Bank bank = new Bank();
        bank.cashMachines[1].addCash(700);
        bank.cashMachines[1].addCash(-200);

        bank.cashMachines[2].addCash(-200);
        bank.cashMachines[2].addCash(-700);
        bank.cashMachines[2].addCash(600);

        assertEquals(400 ,bank.balanceOfAllCashMachines()) ;
    }*/
}
