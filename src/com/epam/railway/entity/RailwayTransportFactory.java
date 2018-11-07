package com.epam.railway.entity;

public class RailwayTransportFactory {
    public RailwayTransport createRailwayTransport(TypeRailwayTransport railwayTransport){
        RailwayTransport transport = null;

        switch (railwayTransport){
            case LOCOMOTIVE:
                transport = new Locomotive();
                break;
            case PASSENGER_WAGON:
                transport = new PassengerWagon();
                break;
            case CARGO_WAGON:
                transport = new CargoWagon();
                break;
            case POST_WAGON:
                transport = new ServiceWagon();
                break;
            default:
                new RuntimeException("Not supported TypeRailwayTransport");

        }
        return transport;
    }
}
