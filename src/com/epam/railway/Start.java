package com.epam.railway;

import com.epam.railway.locomotives.Locomotive;
import com.epam.railway.logic.TrainFormer;
import com.epam.railway.wagons.Wagon;
import com.epam.railway.wagons.wagon_fabrics.OpenWagonCreator;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        OpenWagonCreator openWagonCreator = new OpenWagonCreator();
        List<Wagon> wagons = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            wagons.add(openWagonCreator.createWagon());
        }

        TrainFormer trainFormer = new TrainFormer();
        trainFormer.setWagons(wagons);
        trainFormer.setLocomotive(new Locomotive());
        trainFormer.formedTrain();

        System.out.println(trainFormer.getWeightWagons());







    }
}
