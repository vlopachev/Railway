package com.epam.railway.wagons;

public class CoveredWagon extends Wagon {
    private final double WEIGHT = 26.0;
    private final double PAYLOAD = 68.0;
    private final double VOLUME = 138.0;


    public CoveredWagon() {
        super.setTypeWagon(TypeWagon.Cargo);
    }


}
