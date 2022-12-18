package com.laingard.Excercise4;

public class SmartWatch extends SmartDevice{
    private String timeFormat;

    public SmartWatch(String brand, String model, Integer serialNumber, double inches, String timeFormat) {
        super(brand, model, serialNumber, inches);
        this.timeFormat = timeFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "timeFormat='" + timeFormat + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                ", inches=" + inches +
                '}';
    }
}
