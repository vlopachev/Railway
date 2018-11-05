package com.epam.railway.transport;

public enum TypeServiceWagon {
    POST_WAGON(46.7,20.0,4),
    BAGGAGE_WAGON(52.3,18.3,2),
    RESTAURANT_WAGON(43.0,26.0,48);

    private final double weight;
    private final double payload;
    private final int seats;

    TypeServiceWagon (double weight, double payload, int seats) {
        this.weight = weight;
        this.payload = payload;
        this.seats = seats;
    }

    public double getWeight(){
        return weight;
    }

    public double getPayload() {
        return payload;
    }

    public int getSeats() {
        return seats;
    }

}
