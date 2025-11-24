package org.qcalc;

public class StandardCalculator {


    private double result;

    public void printResult() {
        System.out.println("Calculation Result: " + result);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double value) {
        this.result = value;
    }

    public void add(int num1, int num2) {
        add((double)num1, (double)num2);
    }

    public void subtract(int num1, int num2) {
        subtract((double)num1, (double)num2);
    }

    public void multiply(int num1, int num2) {
        multiply((double) num1, (double) num2);
    }

    public void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }


    // Implementing Double Data Type for above arithmetic operations as main logic and avoid duplicate methods
    public void add(double num1, double num2){
        result = num1 + num2;
    }

    public void subtract(double num1, double num2){
        result = num1 - num2;
    }

    public void multiply(double num1, double num2){
        result = num1 * num2;
    }

    public void divide(double num1, double num2){
        result = num1 / num2;
    }
}
