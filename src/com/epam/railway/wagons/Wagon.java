package com.epam.railway.wagons;

import com.epam.railway.RailwayTransport;

public abstract class Wagon extends RailwayTransport {
    private double carrying;
    private boolean loaded;

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
