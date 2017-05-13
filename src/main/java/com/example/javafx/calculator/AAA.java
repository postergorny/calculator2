package com.example.javafx.calculator;

public class AAA {

    public void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }
}
