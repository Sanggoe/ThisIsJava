package com.sanggoe.chap7_inheritance.cellphone;

public class DmbCellPhone extends Cellphone {
    // Field
    int channel;

    // Constructor
    public DmbCellPhone(String model, String color, int channel) {
        //super(model, color);
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // Method
    void turnOnDmb() {
        System.out.println("Start to receive DMB broadcasting " + channel + "channel.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("Change the " + channel + "channel.");
    }

    void turnOffDmb() {
        System.out.println("Stop to receive DMB broadcasting.");
    }
}
