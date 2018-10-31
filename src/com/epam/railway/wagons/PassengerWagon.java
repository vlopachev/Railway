package com.epam.railway.wagons;

import com.epam.railway.wagons.wagon_fabric.TypePassengerWagon;

public class PassengerWagon extends Wagon {
    private int numberOfseats;
    private int numberOfbeds;
    private double brutto;
    private double baggage;
    private TypePassengerWagon typePassengerWagon;


    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
        switch (typePassengerWagon){
            case Coach:
                numberOfseats = 80;
                brutto = 50.0;
                break;
            case EconomClassCar:
                numberOfbeds = 40;
                brutto = 60.0;
                break;
            case SleepingCar:
                numberOfbeds = 40;
                brutto = 70.0;
                break;
            case DiningCar:
                brutto = 75.0;
                break;
            case BaggageCar:
                brutto = 40.0;
                baggage = 20.0;
                break;
        }
    }

    @Override
    public String toString() {
        return super.getId() + " " +
                "PassengerWagon{" +
                "numberOfseats=" + numberOfseats +
                ", numberOfbeds=" + numberOfbeds +
                ", brutto=" + brutto +
                ", baggage=" + baggage +
                ", typePassengerWagon=" + typePassengerWagon +
                '}';
    }
}
