package com.laingard.Excercise4;

public abstract class SmartDevice {
    protected String brand;
    protected String model;
    protected Integer serialNumber;
    protected double inches;

    public SmartDevice(String brand, String model, Integer serialNumber, double inches) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public double getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                ", inches=" + inches +
                '}';
    }
}
