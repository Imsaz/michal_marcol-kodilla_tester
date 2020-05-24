package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        int subtractionResult = calculator.subtract(a, b);
        int power2Result = calculator.power2(a);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        boolean correctSubtraction = ResultChecker.assertEquals(-3, subtractionResult);
        boolean correctPower2 = ResultChecker.assertEquals(20, power2Result);

        if (correctSum) {
            System.out.println(" Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else
            System.out.println(" Metoda sum  nie działa poprawnie dla liczb " + a + " i " + b);

        if (correctSubtraction) {
            System.out.println(" Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else
            System.out.println(" Metoda subtract  nie działa poprawnie dla liczb " + a + " i " + b);
        if (correctPower2) {
            System.out.println(" Metoda exp działa poprawnie dla liczby " + a);
        } else
            System.out.println(" Metoda exp  nie działa poprawnie dla liczb " + a);
    }
}
