package com.epam.railway;


import com.epam.railway.entity.*;
import com.epam.railway.logic.RailWayUtils;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args)  {
        RailwayTransportFactory factory = new RailwayTransportFactory();
        Locomotive locomotive =
                (Locomotive) factory.createRailwayTransport(TypeRailwayTransport.LOCOMOTIVE);
        locomotive.setTypeLocomotive(TypeLocomotive.LOCOMOTIVE_2ES4K);
        locomotive.setSand(RailWayUtils.SAND_STOCK_2ES4K);
        locomotive.setPower(RailWayUtils.POWER_2ES4K);

        List<RailwayTransport> train = new ArrayList<>();
        train.add(locomotive);

        for (int i = 0; i < 20; i++) {
            CargoWagon wagon =
                    (CargoWagon) factory.createRailwayTransport(TypeRailwayTransport.CARGO_WAGON);
            wagon.setTypeCargoWagon(TypeCargoWagon.OPEN_WAGON);
            wagon.setCargo(72);
            train.add(wagon);
        }

        for (RailwayTransport transport:train){
            System.out.println(transport.getId());
            System.out.println(transport.getFullWeight());
        }


    }
}
