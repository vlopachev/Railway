package com.epam.railway.entity;

public class RailwayTransportFactory {
    public RailwayTransport createRailwayTransport(TypeRailwayTransport railwayTransport){
        RailwayTransport transport = null;

        switch (railwayTransport){
            case LOCOMOTIVE:
                transport = new Locomotive(TypeRailwayTransport.LOCOMOTIVE);
                break;
            case PASSENGER_WAGON:
                transport = new PassengerWagon(TypeRailwayTransport.PASSENGER_WAGON);
                break;
            case CARGO_WAGON:
                transport = new CargoWagon(TypeRailwayTransport.CARGO_WAGON);
                break;
            case SERVICE_WAGON:
                transport = new ServiceWagon(TypeRailwayTransport.SERVICE_WAGON);
                break;
            default:
                throw new RuntimeException("Not supported TypeRailwayTransport");
        }
        return transport;
    }
}
