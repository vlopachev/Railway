package com.epam.railway.wagons;

public class OpenWagon extends Wagon {
    {
        super.setWeight(94.0);
    }

    public OpenWagon() {
        super.setTypeWagon(TypeWagon.Cargo);
    }
}
