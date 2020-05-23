package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        int subtractionResult = calculator.subtract(a, b);
        int expResult = calculator.exp(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        boolean correctS = ResultChecker.assertEquals(-3, subtractionResult);
        boolean correctE = ResultChecker.assertEquals(20, expResult);

        if (correct) {
            System.out.println(" Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else
            System.out.println(" Metoda sum  nie działa poprawnie dla liczb " + a + " i " + b);

        if (correctS) {
            System.out.println(" Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else
            System.out.println(" Metoda subtract  nie działa poprawnie dla liczb " + a + " i " + b);
        if (correctE) {
            System.out.println(" Metoda exp działa poprawnie dla liczby " + a);
        } else
            System.out.println(" Metoda exp  nie działa poprawnie dla liczb " + a);
    }
}
