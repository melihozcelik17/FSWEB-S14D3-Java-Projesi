package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name, String description) {
        super(name, description);
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
