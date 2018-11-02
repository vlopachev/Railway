package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.HopperWagon;
import com.epam.railway.wagons.Wagon;

public class HopperWagonCreator implements WagonCreator{
    @Override
    public Wagon createWagon() {
        return new HopperWagon();
    }
}
