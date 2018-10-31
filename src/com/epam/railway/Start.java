package com.epam.railway;

import com.epam.railway.locomotives.Locomotive;
import com.epam.railway.locomotives.TypeLocomotive;
import com.epam.railway.wagons.PassengerWagon;
import com.epam.railway.wagons.wagon_fabric.TypePassengerWagon;
import com.epam.railway.wagons.wagon_fabric.PassengerWagonCreator;
import com.epam.railway.wagons.wagon_fabric.WagonCreator;

public class Start {
    public static void main(String[] args) {
        RailwayTransport loco = new Locomotive(TypeLocomotive.Passenger);
        RailwayTransport loco1 = new Locomotive(TypeLocomotive.Cargo);

        System.out.println(loco.toString());
        System.out.println(loco1.toString());



        WagonCreator passengerWagonFactory = new PassengerWagonCreator();
        PassengerWagon wagon2 = (PassengerWagon) passengerWagonFactory.createWagon();
        wagon2.setTypePassengerWagon(TypePassengerWagon.EconomClassCar);
        System.out.println(wagon2.toString());



    }
}
