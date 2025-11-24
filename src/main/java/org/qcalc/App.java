package org.qcalc;

public class App {
    public static void main(String[] args) {

        StandardCalculator calc = new StandardCalculator();

        calc.add(10, 10); // int version
        calc.printResult();

        calc.subtract(20.0, 8.0); // double version
        calc.printResult();

        calc.multiply(5.0,4.0); // double version
        calc.printResult();

        calc.divide(10,2); // int version
        calc.printResult();
    }
}