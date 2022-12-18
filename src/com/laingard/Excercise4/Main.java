package com.laingard.Excercise4;

public class Main {
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone("Xiaomi", "Redmi Pro 10", 1599213, 7.5, "Tuenti", false);

        SmartDevice clock = new SmartWatch("Xiaomi", "Mi Band 5", 3384848, 2.4,"24hs");

        System.out.println(phone.toString());
        System.out.println(clock.toString());
    }
}
