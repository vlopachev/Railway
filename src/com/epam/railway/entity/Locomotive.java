package com.epam.railway.entity;

import com.epam.railway.logic.RailWayUtils;

public class Locomotive extends RailwayTransport {
    private TypeLocomotive typeLocomotive;
    private int power;
    private double sand;

    public int getPower() {
        return power;
    }

    public double getSand() {
        return sand;
    }

    public void setSand(double sand) {
        if (typeLocomotive != null){
            switch (typeLocomotive){
                case LOCOMOTIVE_2ES4K:
                    if (sand <= RailWayUtils.SAND_STOCK_2ES4K){
                        this.sand = sand;
                    }
                    break;
                case LOCOMOTIVE_3ES4K:
                    if (sand <= RailWayUtils.SAND_STOCK_3ES4K){
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
            case LOCOMOTIVE_2ES4K:
                setWeight(RailWayUtils.WEIGHT_2ES4K);
                power = RailWayUtils.POWER_2ES4K;
                break;
            case LOCOMOTIVE_3ES4K:
                setWeight(RailWayUtils.WEIGHT_3ES4K);
                power = RailWayUtils.POWER_3ES4K;
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
            return typeLocomotive.toString();
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
