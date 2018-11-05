package com.epam.railway.transport;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
    }

    public int getPower() {
        return typeLocomotive.getPower();
    }

    @Override
    public double getWeight() {
        return typeLocomotive.getWeight();
    }
}
