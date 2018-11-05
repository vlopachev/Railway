package com.epam.railway.transport;

public class ServiceWagon extends RailwayTransport {
    TypeServiceWagon typeServiceWagon;
    private int seats;
    private double cargo;

    public TypeServiceWagon getTypeServiceWagon() {
        return typeServiceWagon;
    }

    public void setTypeServiceWagon(TypeServiceWagon typeServiceWagon) {
        this.typeServiceWagon = typeServiceWagon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats <= typeServiceWagon.getSeats()){
            this.seats = seats;
        } else {
            System.out.println("Maximum seats weight exceeded");
        }
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        if (cargo <= typeServiceWagon.getPayload()){
            this.cargo = cargo;
        } else {
            System.out.println("Maximum load weight exceeded");
        }
    }

    @Override
    public double getWeight() {
        return 0;
    }
}
