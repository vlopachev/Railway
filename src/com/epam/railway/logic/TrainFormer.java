package com.epam.railway.logic;

import com.epam.railway.transport.RailwayTransport;


import java.util.List;

public class TrainFormer {
    List<RailwayTransport> train;

    public TrainFormer() {
    }

    public TrainFormer(List<RailwayTransport> train) {
        this.train = train;
    }

    public void getTypesTrain() {
        for (RailwayTransport transport : train) {
            System.out.println(transport.getClass());
            System.out.println(transport.getId());
            System.out.println(transport.getPayload());
            System.out.println(transport.getTotalWeight());
        }

    }

}

