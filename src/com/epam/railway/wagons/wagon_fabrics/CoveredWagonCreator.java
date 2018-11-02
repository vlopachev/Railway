package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.CoveredWagon;
import com.epam.railway.wagons.Wagon;

public class CoveredWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new CoveredWagon();
    }
}
