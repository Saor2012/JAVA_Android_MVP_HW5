package com.example.androidcalculator.base.view;


import com.example.androidcalculator.base.model.IFactory;

public class View implements ILink.View, IFactory.CallBack {
    private ILink.Presenter presenter;

    @Override
    public void message(String message) {

    }

    @FunctionalInterface
    interface CallBack { void message(String message); }
    public View() {
        presenter = new Presenter();
        presenter.init(this);
    }
    //@Override
    public void init() { presenter.init(this); }
    //@Override
    public void print(String message) { System.out.println(message); }
    //@Override
    public void event() {
        presenter.initFunction(System.out::println);
        //presenter.duckName(System.out::println);
    }//System.out::println
}

