package com.epam.railway.wagons.wagon_fabric;

import com.epam.railway.wagons.PostWagon;
import com.epam.railway.wagons.Wagon;

public class PostWagonCreator implements WagonCreator {
    @Override
    public Wagon createWagon() {
        return new PostWagon();
    }
}
