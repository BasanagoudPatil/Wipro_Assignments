package com.math.operations;

public class Division {
    public static double div(double a,double b) {
        if (b==0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }
}
