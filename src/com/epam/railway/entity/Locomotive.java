package com.epam.railway.entity;

import com.epam.railway.logic.RailwayUtils;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;
    private int power;
    private double sand;

    public Locomotive(TypeRailwayTransport typeRailwayTransport) {
        super(typeRailwayTransport);
    }

    public int getPower() {
        return power;
    }

    public double getSand() {
        return sand;
    }

    public void setSand(double sand) {
        if (typeLocomotive != null){
            switch (typeLocomotive){
                case _2ES4K:
                    if (sand <= RailwayUtils.SAND_STOCK_2ES4K){
                        this.sand = sand;
                    }
                    break;
                case _3ES4K:
                    if (sand <= RailwayUtils.SAND_STOCK_3ES4K){
                        this.sand = sand;
                    }
                    break;
                default:
                    throw new RuntimeException("Not Supported TypeLocomotive");
            }
        }
    }

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
        switch (typeLocomotive){
            case _2ES4K:
                setWeight(RailwayUtils.WEIGHT_2ES4K);
                power = RailwayUtils.POWER_2ES4K;
                break;
            case _3ES4K:
                setWeight(RailwayUtils.WEIGHT_3ES4K);
                power = RailwayUtils.POWER_3ES4K;
                break;
            default:
                throw new RuntimeException("Not Supported TypeLocomotive");
        }
    }

    @Override
    public double getFullWeight() {
        return getWeight() + sand;
    }

    @Override
    public String getTypeTransport() {
        if (typeLocomotive != null){
            return getTypeRailwayTransport().toString() + ":" + typeLocomotive.toString();
        }
        return "Type not set";
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "id=" + getId() +
                ", typeLocomotive=" + typeLocomotive +
                ", power=" + power +
                ", fullWeight=" + getFullWeight() +
                '}';
    }
}
