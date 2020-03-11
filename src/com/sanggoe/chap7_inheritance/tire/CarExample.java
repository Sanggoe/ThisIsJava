package com.sanggoe.chap7_inheritance.tire;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("FrontLeft change HankookTire");
                    car.frontLeftTire = new HankookTire("FrontLeft", 15);
                    break;
                case 2:
                    System.out.println("FrontRight change KumhoTire");
                    car.frontRightTire = new KumhoTire("FrontRight", 13);
                    break;
                case 3:
                    System.out.println("BackLeft change HankookTire");
                    car.backLeftTire = new HankookTire("BackLeft", 14);
                    break;
                case 4:
                    System.out.println("BackRight change KumhoTire");
                    car.backRightTire = new KumhoTire("BackRight", 17);
                    break;
            }
            System.out.println("----------------------- add 1time -----------------------");
        }
    }
}
