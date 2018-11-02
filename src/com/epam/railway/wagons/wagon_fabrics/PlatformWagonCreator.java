package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.PlatformWagon;
import com.epam.railway.wagons.Wagon;

public class PlatformWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new PlatformWagon();
    }
}
