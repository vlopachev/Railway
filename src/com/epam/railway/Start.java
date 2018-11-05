package com.epam.railway;


import com.epam.railway.logic.TrainFormer;
import com.epam.railway.transport.*;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<RailwayTransport> train = new ArrayList<>();
        RailwayTransportFactory transportFactory = new RailwayTransportFactory();
        Locomotive locomotive = (Locomotive) transportFactory.createRailwayTransport(TypeRailwayTransport.LOCOMOTIVE);
        locomotive.setTypeLocomotive(TypeLocomotive.L2ES4K);
        train.add(locomotive);

        for (int i = 0; i < 20; i++) {
            CargoWagon cargoWagon = (CargoWagon) transportFactory.createRailwayTransport(TypeRailwayTransport.CARGO_WAGON);
            cargoWagon.setTypeCargoWagon(TypeCargoWagon.OPEN_WAGON);
            cargoWagon.setCargo(50);
            train.add(cargoWagon);
        }

        TrainFormer trainFormer = new TrainFormer(train);
        trainFormer.getTypesTrain();
    }
}
