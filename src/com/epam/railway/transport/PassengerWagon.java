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
        this.seats = seats;
    }

    @Override
    public void setPayload(double payload) {
        if (payload <= typePassengerWagon.getMaxPayload()){
            setPayload(payload);
        } else {
            System.out.println("Maximum load weight exceeded");
        }

    }
}
