package com.workintech.model;

public class Holden extends Car {


    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + "engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + "the car is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() +"the car is accelerating";
    }
}
