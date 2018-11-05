package com.epam.railway.transport;

public class PassengerWagon extends RailwayTransport {
    TypePassengerWagon typePassengerWagon;
    private int seats;


    public TypePassengerWagon getTypePassengerWagon() {
        return typePassengerWagon;
    }

    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats <= typePassengerWagon.getSeats()){
            this.seats = seats;
        } else {
            System.out.println("Maximum seats weight exceeded");
        }
    }

    @Override
    public double getWeight() {
        return typePassengerWagon.getWeight();
    }
}
