package com.example.androidcalculator.base.model;

import java.util.Objects;

public class Pair<TYPE,OPER,VAL1,VAL2> {
    private TYPE type;
    private OPER oper;
    private VAL1 val1;
    private VAL2 val2;
    public Pair() {}
    public Pair(TYPE type, OPER oper, VAL1 val1, VAL2 val2) {
        this.type = type;
        this.oper = oper;
        this.val1 = val1;
        this.val2 = val2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?, ?, ?> pair = (Pair<?, ?, ?, ?>) o;
        return Objects.equals(type, pair.type) && Objects.equals(oper, pair.oper) &&
                Objects.equals(val1, pair.val1) && Objects.equals(val2, pair.val2);
    }
    @Override
    public int hashCode() { return Objects.hash(type, oper, val1, val2); }
    public TYPE getType() { return type; }
    public void setType(TYPE type) { this.type = type; }
    public OPER getOper() { return oper; }
    public void setOper(OPER oper) { this.oper = oper; }
    public VAL1 getVal1() { return val1; }
    public void setVal1(VAL1 val1) { this.val1 = val1; }
    public VAL2 getVal2() { return val2; }
    public void setVal2(VAL2 val2) { this.val2 = val2; }
    @Override
    public String toString() {
        return "Pair{" +
                "type=" + type +
                ", oper=" + oper +
                ", val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}

