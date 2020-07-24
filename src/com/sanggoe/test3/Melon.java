package com.sanggoe.test3;

public class Melon extends Food {
    String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Melon" +
                "\ninfo : " + info +
                "\ncal=" + cal +
                "\ncost=" + cost +
                "\nkg=" + kg;
    }
}
