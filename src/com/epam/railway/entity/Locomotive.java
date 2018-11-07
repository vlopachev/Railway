package com.epam.railway.entity;

import com.epam.railway.logic.ParametersRailWayTransport;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;
    private int power;
    private double sand;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getSand() {
        return sand;
    }

    public void setSand(double sand) {
        if (typeLocomotive != null){
            switch (typeLocomotive){
                case LOCOMOTIVE_2ES4K:
                    if (sand <= ParametersRailWayTransport.SAND_STOCK_2ES4K){
                        this.sand = sand;
                    }
                    break;
                case LOCOMOTIVE_3ES4K:
                    if (sand <= ParametersRailWayTransport.SAND_STOCK_3ES4K){
                        this.sand = sand;
                    }
                    break;
                default:
                    new RuntimeException("NotSupportedTypeLocomotive");
            }
        }
    }

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
    }

    @Override
    public double getFullWeight() {
        return getWeight() + sand * ParametersRailWayTransport.SAND_LITER_WEIGHT;
    }
}
