package com.example.androidcalculator.base.model;


import static com.example.androidcalculator.base.model.Constants.TAG_CALC;
import static com.example.androidcalculator.base.model.Constants.TAG_CONVERTOR;

public class Factory {
    private static Factory instance;
    private Factory() {}
    public static synchronized Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }
    public <TYPE,OPER,VAL1,VAL2>IFactory factory(IFactory.CallBack listener, Pair<TYPE,OPER,VAL1,VAL2> pair){
        switch ((String)pair.getType()) {
            case TAG_CALC:
                return new Calculator(listener,(Pair<String, String, String, String>) pair); //listener,(Pair<String, String, Object, Object>) pair
            case TAG_CONVERTOR:
                return new Convertor(listener, (Pair<String, String, String, String>) pair);
            default: throw new ArithmeticException();
        }
    }
}
