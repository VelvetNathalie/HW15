package com.pb.vlasenko.hw10;

public class Number<T> {
private T numBox;

    public Number(T numBox) {
        this.numBox = numBox;
    }

    public T getNumBox() {
        return numBox;
    }

    public void setNumBox(T numBox) {
        this.numBox = numBox;
    }
}
