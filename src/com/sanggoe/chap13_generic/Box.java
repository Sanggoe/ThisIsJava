package com.sanggoe.chap13_generic;

/*
public class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get(Object object) {
        return this.object;
    }
}
*/


public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
