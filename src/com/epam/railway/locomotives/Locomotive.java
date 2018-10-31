package com.epam.railway.locomotives;

import com.epam.railway.RailwayTransport;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;
    private int power;

    public Locomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
        setTypeLocomotive(typeLocomotive);
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
        switch (typeLocomotive) {
            case Passenger:
                power = 5000;

                break;
            case Cargo:
                power = 8000;
                break;
        }
    }

    @Override
    public String toString() {
        return super.getId() + " " +
                "Locomotive{" +
                "typeLocomotive=" + typeLocomotive +
                ", power=" + power +
                '}';
    }
}
