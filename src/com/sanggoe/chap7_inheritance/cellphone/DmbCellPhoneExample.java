package com.sanggoe.chap7_inheritance.cellphone;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        // Construct DmbCellPhone Object
        DmbCellPhone dmbCellPhone = new DmbCellPhone("Samsung G20", "Black", 10);

        // Inherited field from CellPhone
        System.out.println("Model: " + dmbCellPhone.model);
        System.out.println("Color: " + dmbCellPhone.color);

        // Field of DmbCellPhone
        System.out.println("Channel: " + dmbCellPhone.channel);

        // Inherited method from CellPhone
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello?");
        dmbCellPhone.receiveVoice("Hi, I'm Hong gil dong.");
        dmbCellPhone.sendVoice("Ah~ Yea I'm glad to meat you!");
        dmbCellPhone.hangUp();

        // Method of DmbCellPhone
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
