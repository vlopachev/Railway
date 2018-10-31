package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.BaggageWagon;
import com.epam.railway.wagons.Wagon;

public class BaggageWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new BaggageWagon();
    }
}
