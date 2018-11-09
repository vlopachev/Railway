package com.epam.railway;


import com.epam.railway.entity.*;
import com.epam.railway.logic.RailwayUtils;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args)  {
        RailwayTransportFactory factory = new RailwayTransportFactory();
        Locomotive locomotive =
                (Locomotive) factory.createRailwayTransport(TypeRailwayTransport.LOCOMOTIVE);
        locomotive.setTypeLocomotive(TypeLocomotive._2ES4K);
        locomotive.setSand(RailwayUtils.SAND_STOCK_2ES4K);


        List<RailwayTransport> train = new ArrayList<>();


        for (int i = 0; i < 30; i++) {
            CargoWagon wagon =
                    (CargoWagon) factory.createRailwayTransport(TypeRailwayTransport.CARGO_WAGON);
            wagon.setTypeCargoWagon(TypeCargoWagon.COVERED_WAGON);
            wagon.setCargo(68);
            train.add(wagon);
        }

        for (int i = 0; i < 30; i++) {
            CargoWagon wagon =
                    (CargoWagon) factory.createRailwayTransport(TypeRailwayTransport.CARGO_WAGON);
            wagon.setTypeCargoWagon(TypeCargoWagon.OPEN_WAGON);
            wagon.setCargo(70);
            train.add(wagon);
        }

        train.add(locomotive);


        for (RailwayTransport transport:train){
            System.out.println(transport);
        }


        System.out.println(RailwayUtils.isEnoughPowerLocomotiveForWagons(train));




    }
}
