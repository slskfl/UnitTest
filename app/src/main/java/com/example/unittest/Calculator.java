package com.example.unittest;

public class Calculator {
    int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b){
        return a+b;
    }
    public boolean equalTo(int a, int b){
        return a==b;
    }
}
