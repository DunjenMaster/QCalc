package org.qcalc;

public class StandardCalculator {


    private int result;

    public void printResult() {
        System.out.println("Calculation Result: " + result);
    }

    public int getResult() {
        return result;
    }

    public void setResult(int value) {
        this.result = value;
    }

    public void add(int num1, int num2) {
        result = num1 + num2;
    }

    public void substract(int num1, int num2) {
        result = num1 - num2;
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
    }

    public void divide(int num1, int num2) {
        result = num1 / num2;
    }

}
