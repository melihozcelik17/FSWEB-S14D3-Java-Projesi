package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class ElekctricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElekctricCar(String name, String description) {
        super(name, description);
    }

    public ElekctricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
