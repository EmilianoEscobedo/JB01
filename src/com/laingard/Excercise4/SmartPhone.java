package com.laingard.Excercise4;

public class SmartPhone extends SmartDevice {
    private String operator;
    private boolean is5G;

    public SmartPhone(String brand, String model, Integer serialNumber, double inches, String operator, boolean is5G) {
        super(brand, model, serialNumber, inches);
        this.operator = operator;
        this.is5G = is5G;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isIs5G() {
        return is5G;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                ", inches=" + inches +
                ", operator='" + operator + '\'' +
                ", is5G=" + is5G +
                '}';
    }
}
