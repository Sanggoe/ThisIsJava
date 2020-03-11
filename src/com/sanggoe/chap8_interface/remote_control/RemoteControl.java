package com.sanggoe.chap8_interface.remote_control;

public interface RemoteControl {
    // 상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
        } else {
            System.out.println("무음 해제");
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("건전지 교체");
    }
}
