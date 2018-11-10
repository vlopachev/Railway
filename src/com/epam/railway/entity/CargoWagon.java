package com.epam.railway.entity;


import com.epam.railway.logic.RailwayUtils;

public class CargoWagon extends RailwayTransport {
    private TypeCargoWagon typeCargoWagon;
    private double cargo;
    private double payload;

    public CargoWagon(TypeRailwayTransport typeRailwayTransport) {
        super(typeRailwayTransport);
    }

    public TypeCargoWagon getTypeCargoWagon() {
        return typeCargoWagon;
    }

    public void setTypeCargoWagon(TypeCargoWagon typeCargoWagon) {
        this.typeCargoWagon = typeCargoWagon;
        switch (typeCargoWagon) {
            case COVERED_WAGON:
                setWeight(RailwayUtils.WEIGHT_COVERED_WAGON);
                payload = RailwayUtils.PAYLOAD_COVERED_WAGON;
                break;
            case OPEN_WAGON:
                setWeight(RailwayUtils.WEIGHT_OPEN_WAGON);
                payload = RailwayUtils.PAYLOAD_OPEN_WAGON;
                break;
            case HOPPER_WAGON:
                setWeight(RailwayUtils.WEIGHT_HOPPER_WAGON);
                payload = RailwayUtils.PAYLOAD_HOPPER_WAGON;
                break;
            case PLATFORM_WAGON:
                setWeight(RailwayUtils.WEIGHT_PLATFORM_WAGON);
                payload = RailwayUtils.PAYLOAD_PLATFORM_WAGON;
                break;
            case TANK_WAGON:
                setWeight(RailwayUtils.WEIGHT_TANK_WAGON);
                payload = RailwayUtils.PAYLOAD_TANK_WAGON;
                break;
            default:
                throw new RuntimeException("Not Supported TypeCargoWagon");
        }
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (payload > 0 && cargo <= payload) {
            this.cargo = cargo;
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
        if (typeCargoWagon != null) {
            return getTypeRailwayTransport().toString() + ":" + typeCargoWagon.toString();
        }
        return "Type not set";
    }

    @Override
    public String toString() {
        return "CargoWagon{" +
                "id=" + getId() +
                ", typeCargoWagon=" + typeCargoWagon +
                ", weight=" + getWeight() +
                ", cargo=" + cargo +
                ", fullWeight=" + getFullWeight() +
                '}';
    }
}
