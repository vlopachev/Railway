package com.epam.railway.locomotives;

import com.epam.railway.RailwayTransport;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;
    private int power;

    public Locomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
    }

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }
}
