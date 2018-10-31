package com.epam.railway.wagons.wagon_fabrics;

import com.epam.railway.wagons.Wagon;
import com.epam.railway.wagons.RestaurantWagon;

public class WagonRestaurantCreator implements WagonCreator{
    @Override
    public Wagon createWagon() {
        return new RestaurantWagon();
    }
}
