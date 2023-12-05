package com.workintech.skeleton;

import com.workintech.company.ElekctricCar;
import com.workintech.company.GasPoweredCar;
import com.workintech.company.HybridCar;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        runEngine(this);
        return getName() + "Start engine ....";
    }
    public String drive(){
        runEngine(this);
        return getName() + "is driving ...";
    }


    public void runEngine(CarSkeleton carSkeleton) {
        //((GasPoweredCar)carSkeleton)
        if(carSkeleton instanceof GasPoweredCar){


            System.out.println();

        }else if(carSkeleton instanceof HybridCar){
            System.out.println();

        }else if (carSkeleton instanceof ElekctricCar){
            System.out.println();

        }else {
            System.out.println();
        }

    }
}
