package com.laingard.Excercise5;

public class Main {
    public static void main(String[] args) {
        CarCRUD car1 = new CarCRUDimpl();
        car1.save();
        car1.findAll();
        car1.delete();
    }
}