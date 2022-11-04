package com.example.springbootcalculator.entity;



public class Operations {

    private String operation;
    private int a;
    private int b;
    private int c;

    public Operations() {
    }

    public Operations(int c) {
        this.c = c;
    }

    public Operations(String operation) {
        this.operation = operation;
    }

    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
