package org.example;

import java.util.List;

public class Box<T extends List> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() {
        return t;
    }
}
