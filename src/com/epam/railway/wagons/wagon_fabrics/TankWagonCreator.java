package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.TankWagon;
import com.epam.railway.wagons.Wagon;

public class TankWagonCreator implements WagonCreator{
    @Override
    public Wagon createWagon() {
        return new TankWagon();
    }
}
