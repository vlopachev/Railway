package com.epam.railway.entity;


import com.epam.railway.logic.RailWayUtils;

public class CargoWagon extends RailwayTransport {
    private TypeCargoWagon typeCargoWagon;
    private double cargo;
    private double payload;

    public TypeCargoWagon getTypeCargoWagon() {
        return typeCargoWagon;
    }

    public void setTypeCargoWagon(TypeCargoWagon typeCargoWagon) {
        this.typeCargoWagon = typeCargoWagon;
        switch (typeCargoWagon){
            case COVERED_WAGON:
                setWeight(RailWayUtils.WEIGHT_COVERED_WAGON);
                break;
            case OPEN_WAGON:
                setWeight(RailWayUtils.WEIGHT_OPEN_WAGON);
                break;
            case HOPPER_WAGON:
                setWeight(RailWayUtils.WEIGHT_HOPPER_WAGON);
                break;
            case PLATFORM_WAGON:
                setWeight(RailWayUtils.WEIGHT_PLATFORM_WAGON);
                break;
            case TANK_WAGON:
                setWeight(RailWayUtils.WEIGHT_TANK_WAGON);
                break;
            default:
                new RuntimeException("Not Supported TypeCargoWagon");
        }

    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (typeCargoWagon != null){
            switch (typeCargoWagon){
                case COVERED_WAGON:
                    payload = RailWayUtils.PAYLOAD_COVERED_WAGON;
                    break;
                case OPEN_WAGON:
                    payload = RailWayUtils.PAYLOAD_OPEN_WAGON;
                    break;
                case HOPPER_WAGON:
                    payload = RailWayUtils.PAYLOAD_HOPPER_WAGON;
                    break;
                case PLATFORM_WAGON:
                    payload = RailWayUtils.PAYLOAD_PLATFORM_WAGON;
                    break;
                case TANK_WAGON:
                    payload = RailWayUtils.PAYLOAD_TANK_WAGON;
                    break;
                default:
                    new RuntimeException("Not Supported TypeCargoWagon");
            }
            if (cargo <= payload){
                this.cargo = cargo;
            }
        }

    }

    public double getPayload() {
        return payload;
    }

    @Override
    public double getFullWeight() {
        return getWeight() + cargo;
    }

    @Override
    public String getTypeTransport() {
        if (typeCargoWagon != null){
            return typeCargoWagon.toString();
        }
        return "Type not set";
    }


}
