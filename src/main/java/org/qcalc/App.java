package org.qcalc;

public class App {
    public static void main(String[] args) {

        StandardCalculator calc = new StandardCalculator();

        calc.add(10, 10);
        calc.printResult();

        calc.substract(20, 8);
        calc.printResult();

        calc.multiply(5,4);
        calc.printResult();

        calc.divide(10,2);
        calc.printResult();
    }
}