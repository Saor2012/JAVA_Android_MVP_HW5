package com.example.androidcalculator.base.model;

import java.io.*;
import java.util.Objects;

public class Calculator implements IFactory {
    private static int result;
    private String res;

    public void setRes(String res) {
        this.res = res;
    }

    private IFactory.CallBack listener;
    private Pair<String,String,String,String> pair ;
    public Calculator(IFactory.CallBack listener, Pair<String,String,String,String> pair) {
        this.listener = listener;
        this.pair = pair;
        Init();
    }
    /*public Calculator() {}
    private static Calculator instance;
    public static synchronized Calculator getInstance() {
        if (instance == null)
            instance = new Calculator();
        return instance;
    }*/
    public void Init()  {
        try { // if
        /*BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int a, b, k = 0;
        boolean state = false;
        String text = "";
        System.out.println("//(Handle integer number)");
        System.out.print("Enter number a: ");
        a = Integer.valueOf(text = br.readLine());
        System.out.println("Your first number = " + a);
        System.out.print("Enter number b: ");
        b = Integer.valueOf(text = br.readLine());
        System.out.println("Your second number = " + b);
        System.out.print("Enter the math function (/, *, +, -): ");
        do {
            text = br.readLine();
            //if ((text != "/" || text != "*" || text != "+" || text != "-")) {
            //    System.out.println("Invalid function, enter a function.");
            //}
            state = (text.equals("/") || text.equals("*") || text.equals("+") || text.equals("-"));
            //System.out.println(text.equals("/"));
            //System.out.println(text.equals("*"));
            //System.out.println(text.equals("-"));
            //System.out.println(text.equals("+"));
            //System.out.println(state);
            if (!state) {
                System.out.println("Invalid math function.");
                System.out.print("Enter the math function (/, *, +, -): ");
            } else {
                if (text.equals("/")) {
                    k = 3;
                } else if (text.equals("*")) {
                    k = 4;
                } else if (text.equals("+")) {
                    k = 1;
                } else if (text.equals("-")) {
                    k = 2;
                } else k = 0;
            }
        } while (!state);
        System.out.println("Your math function \"" + text + "\"");*/
            //System.out.println(k);
            //System.out.println("Number a = " + a + ", number b = " + b);
            //System.out.println("Output number = " + selectFun(k, a, b));
            //String a = calculate();
            //System.out.println(a);
            listener.message(calculate());
            //while(!(text = br.readLine()).equals("ESC")) {}
        } catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
    public static int mathSum(int a, int b) { return a + b; }
    public static int mathDif(int a, int b) { return a - b; }
    public static int mathDiv(int a, int b) { return b == 0 ? 0 : a / b; }
    public static int mathMul(int a, int b) { return a * b; }
    public static int selectFun(int num, int a, int b) {
        int result = -1;
        switch(num) {
            case 1: System.out.println("Sum = " + (result = mathSum(a, b)));
                break;
            case 2: System.out.println("Difference = " + (result = mathDif(a, b)));
                break;
            case 3: System.out.println("Division = " + (result = mathDiv(a, b)));
                break;
            case 4: System.out.println("Multiply = " + (result = mathMul(a, b)));
                break;
            default: System.out.println("Invalid function.");
        }
        return result;
    }
    public String calculate() {
        int result = 0;
        switch(pair.getOper()) {
            case "+": System.out.println("Sum = " + (result = mathSum(Integer.valueOf(pair.getVal1()), Integer.valueOf(pair.getVal2()))));
                break;
            case "-": System.out.println("Difference = " + (result = mathDif(Integer.valueOf(pair.getVal1()), Integer.valueOf(pair.getVal2()))));
                break;
            case "/": System.out.println("Division = " + (result = mathDiv(Integer.valueOf(pair.getVal1()), Integer.valueOf(pair.getVal2()))));
                break;
            case "*": System.out.println("Multiply = " + (result = mathMul(Integer.valueOf(pair.getVal1()), Integer.valueOf(pair.getVal2()))));
                break;
            default: System.out.println("Invalid function.");
        }
        return Integer.toString(result);
    }
    public static int getResult() { return result; }
    //public static int getlistener() { return listener; }
    //public static int getPair() { return pair; }
    public String toString() { return "com.example.calculatorandroid.base.view.Calculator{" + ", result = \"" + result + '\"' + "}"; }
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Calculator duck = (Calculator) a;
        return Objects.equals(result, duck.result); //Objects.equals(instance, duck.instance) &&
    }
}
