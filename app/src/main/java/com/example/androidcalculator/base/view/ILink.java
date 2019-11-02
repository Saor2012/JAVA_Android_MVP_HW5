package com.example.androidcalculator.base.view;

import com.example.androidcalculator.base.model.IFactory;

public interface ILink {
    interface View {
        void init();
        void print(String message);
        void event();
    }
    interface Presenter {
        //void init(Compare.View pattern.view);
        //void duckName(IFactory.CallBack callback); //test.pattern.pattern.view.View.CallBack.callBack
        void initFunction(IFactory.CallBack callback);
        void init(ILink.View view);
    }

}
