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
        double result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || (result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Overflow/Underflow occurred during addition operation");
        }
        this.result = result;
    }

    public void subtract(double num1, double num2){
       double result = num1 - num2;
       if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.POSITIVE_INFINITY) || (result == Double.MAX_VALUE)){
              throw new ArithmeticException("Overflow/Underflow occurred during subtraction operation");
       }
       this.result = result;
    }


    public void multiply(double num1, double num2){
        double result = num1 * num2;
        if(Double.isInfinite(result)){
            throw new ArithmeticException("Overflow/Underflow occurred during multiplication operation");
        }
        this.result = result;
    }

    public void divide(double num1, double num2){
        double result = num1 / num2;
        if(Double.isInfinite(result) || Double.isNaN(result)){
            throw new ArithmeticException("Invalid division (infinity or NAN");
        }
        this.result = result;
    }
}
