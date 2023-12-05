package com.workintech.model;

public class Car {
    private boolean engine;
    private int cylinders ;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        isEngine(true);
        setWheels(4);


    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine(boolean b) {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine(){
        System.out.println("Class name" + getClass().getSimpleName());
        return "the car's engine is starting";

    }
    public String accelerate() {
        System.out.println("Class name" + getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println("Class name" + getClass().getSimpleName());
        return "the car is accelerating";
    }



    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("name" + name + "\n");
        builder.append("Cylinders" + cylinders + "\n");
        return  builder.toString();
    }

    @Override
    public boolean equals (Object o) {
        if(this == o ) return true;
        if(o==null || getClass() != o. getClass()) return false;
        return ((Car)o).cylinders == this.cylinders && ((Car) o ).name.equals(this.name);

        // Car car = (Car) 0 ;
        // return cylinders == car.cylinders && name.equals(car.name);
    }


}
