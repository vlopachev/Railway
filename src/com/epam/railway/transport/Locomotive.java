package com.epam.railway.transport;

public class Locomotive extends RailwayTransport {
    TypeLocomotive typeLocomotive;
    private int power;

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
