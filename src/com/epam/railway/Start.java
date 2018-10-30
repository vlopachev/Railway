package com.epam.railway;

import com.epam.railway.locomotives.Locomotive;
import com.epam.railway.locomotives.TypeLocomotive;
import com.epam.railway.wagons.Wagon;
import com.epam.railway.wagons.wagon_fabric.CargoWagonCreator;
import com.epam.railway.wagons.wagon_fabric.WagonCreator;

public class Start {
    public static void main(String[] args) {
        RailwayTransport loco = new Locomotive(TypeLocomotive.Electro);
        RailwayTransport loco1 = new Locomotive(TypeLocomotive.Diesel);

        System.out.println("" + loco.getId() + ((Locomotive) loco).getTypeLocomotive());
        System.out.println("" + loco1.getId() + ((Locomotive) loco1).getTypeLocomotive());

        WagonCreator wagonFactory = new CargoWagonCreator();
        Wagon wagon = wagonFactory.createWagon();

        System.out.println(wagon.isLoaded());



    }
}
