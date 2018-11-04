package com.epam.railway.transport;

public enum TypePassengerWagon {
    SLEEPING_WAGON(50,54.0,18),
    OPEN_SLEEPING_WAGON(50,54.0,36),
    POST_WAGON(46.7,20.0,4),
    BAGGAGE_WAGON(52.3,18.3,2),
    RESTAURANT_WAGON(43.0,26.0,48);


    private final double weightWagon;
    private final double maxPayload;
    private final int seats;

    TypePassengerWagon(double weightWagon, double maxPayload, int seats) {
        this.weightWagon = weightWagon;
        this.maxPayload = maxPayload;
        this.seats = seats;
    }

    public double getWeightWagon(){
        return weightWagon;
    }

    public double getMaxPayload(){
        return maxPayload;
    }

    public int getSeats() {
        return seats;
    }


}
