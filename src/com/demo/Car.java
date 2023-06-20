package com.demo;

public class Car {

    private String name;
    private String manufacture;

    public Car() {
    }

    public Car(String name, String manufacture) {
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
