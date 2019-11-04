package com.example.androidcalculator.base.view;

import com.example.androidcalculator.base.model.IFactory;
/*import com.example.androidcalculator.base.model.Calculator;
import com.example.androidcalculator.base.model.Convertor;
import com.example.androidcalculator.base.model.Factory;
import com.example.androidcalculator.base.model.Pair;*/
import com.example.androidcalculator.base.model.*;
import static com.example.androidcalculator.base.model.Constants.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Presenter implements ILink.Presenter {
    private ILink.View view;
    private Pair<String,String,String,String> pair;
    //private Calculator calculator = new Calculator();
    public static boolean isNumeric(String str) {
        return str.matches(TAG_CALC_REG1_STRING);
    }
    public static boolean isMathOperator(String str) {
        return str.matches(TAG_CALC_REG2_STRING);
    }
    public void isStarter() {
        /*if (text1.getText().toString().mathes(TAG_CALC_REG3_STRING)) {
            initualPair();
        } else {
            System.out.println("Error: Invalid String");
        }*/
    }
    private Pair initualPair() {
        /*try { // if
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            double a, b;
            int k = 0;
            String c = "", d, e, f;
            boolean state = false;
            String text = "";
            System.out.println("Enter type, operator, value 1, value 2:");
            System.out.print("Enter number a: ");
            do {
                text = br.readLine();
                state = isNumeric(text) == true;
                if (!state) {
                    System.out.println("Invalid number.");
                    System.out.print("Enter the digit number a: ");
                }
            } while (!state);
            state = false;
            a = Integer.valueOf(e = text);
            System.out.println("Your first number = " + a);
            System.out.print("Enter number b: ");
            do {
                text = br.readLine();
                state = isNumeric(text) == true;
                if (!state) {
                    System.out.println("Invalid number.");
                    System.out.print("Enter the digit number b: ");
                }
            } while (!state);
            state = false;
            b = Integer.valueOf(f = text);
            System.out.println("Your second number = " + b);
            System.out.print("Enter number type of function(1 - calculator, 2 - convertor): ");
            do {
                text = br.readLine();
                state = (text.equals("1") || text.equals("2")); // || text.equals("calculator") || text.equals("convertor")
                if (!state) {
                    System.out.println("Invalid type function.");
                    System.out.print("Enter the type function (1 - calculator, 2 - convertor): ");
                } else {
                    switch (text) {
                        case "1": c = "calculator";
                            break;
                        case "2": c = "convertor";
                            break;
                        default: c = "0";
                    }
                }
            } while (!state);
            state = false;
            System.out.println("Your type = " + c);
            if (c.equals("calculator")) {
                System.out.print("Enter math operator('/', '*', '+', '-'): ");
                do {
                    text = br.readLine();
                    state = (text.equals("/") || text.equals("*") || text.equals("+") || text.equals("-"));
                    if (!state) {
                        System.out.println("Invalid math function.");
                        System.out.print("Enter the math function (/, *, +, -): ");
                    }
                } while (!state);
            } else if (c.equals("convertor")) {
                System.out.print("Enter the convertor function (from bits: 8 - to bits,\n b - to bytes, k - to kilobytes, m - to megabytes,\n g - to gigabytes): ");
                do {
                    text = br.readLine();
                    state = (text.equals("8") || text.equals("b") || text.equals("k") || text.equals("m") || text.equals("g"));
                    if (!state) {
                        System.out.println("Invalid math function.");
                        System.out.print("Enter the convertor function (8, b, k, m, g): ");
                    }
                } while (!state);
            }
            state = false;
            d = text;
            System.out.println("Your operator = " + d);
            return new Pair(c, d, e, f);
        } catch(Exception e) {
            System.out.println("Error");
        }*/
        try {

            return new Pair(0, 0, 0, 0);
        } catch (Exception e){
            return new Pair(0, 0, 0, 0);
        }
        //return new Pair(0, 0, 0, 0);
    }

    //@Override
    public void init(ILink.View view) { this.view = view; }
    //@Override
    public void duckName(IFactory.CallBack callback) { //pattern.pattern.view.View.CallBack callBack
        /*Duck.getInstance().setName("Bob");
        callBack.message(Duck.getInstance().getName());
        view.print(Duck.getInstance().getName());
        callBack.message();*/
        /*Calculator.getInstance().Init();
        view.print(Calculator.getInstance().getResult());
        System.out.println(Calculator.getInstance().getResult());
        View.CallBack.message(Calculator.getInstance().getResult());*/
        /*Convertor.getInstance().Init();
        System.out.println(Convertor.getInstance().getResult());*/

    }
    public void initFunction(IFactory.CallBack callback) {
        //Calculator.getInstance().Init();
        //callback.message();
        Factory.getInstance().factory(callback, initualPair());

    }
    public void message(String str) { view.print(str); }
}

