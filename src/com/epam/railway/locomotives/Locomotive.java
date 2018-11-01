package com.epam.railway.locomotives;

import com.epam.railway.RailwayTransport;

public class Locomotive extends RailwayTransport {
    private int tractionForce;
    private TypeLocomotive typeLocomotive;

    public Locomotive(TypeLocomotive typeLocomotive) {
        this.tractionForce = tractionForce;
        this.typeLocomotive = typeLocomotive;
    }

    @Override
    protected String getTypeTransport() {
        return typeLocomotive.toString();
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "id=" +super.getId() + " " +
                "tractionForce=" + tractionForce +
                ", typeLocomotive=" + typeLocomotive +
                '}';
    }
}
