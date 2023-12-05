package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;

    public HybridCar(String name, String description) {
        super(name, description);
    }

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
