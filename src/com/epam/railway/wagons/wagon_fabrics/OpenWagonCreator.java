package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.OpenWagon;
import com.epam.railway.wagons.Wagon;

public class OpenWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new OpenWagon();
    }
}
