package com.epam.railway.wagons.wagon_fabric;

import com.epam.railway.wagons.PassengerWagon;
import com.epam.railway.wagons.Wagon;

public class PassengerWagonCreator implements WagonCreator{

    @Override
    public Wagon createWagon() {
        return new PassengerWagon();
    }


}
