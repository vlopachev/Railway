package com.epam.railway.wagons.wagon_fabric;

import com.epam.railway.wagons.CargoWagon;
import com.epam.railway.wagons.Wagon;

public class CargoWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new CargoWagon();
    }
}
