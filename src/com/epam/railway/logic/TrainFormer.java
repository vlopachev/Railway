package com.epam.railway.logic;

import com.epam.railway.RailwayTransport;
import com.epam.railway.locomotives.Locomotive;
import com.epam.railway.wagons.Wagon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class TrainFormer {
    private List<Wagon> wagons;
    private Locomotive locomotive;
    private Deque<RailwayTransport> train = new ArrayDeque<>();

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public void formedTrain(){
        if (wagons != null && wagons.size() > 0 && locomotive != null){
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }
    }

    public double getWeightWagons(){
        double weight = 0;
        if (wagons != null){
            for (Wagon wagon:wagons){
                weight += wagon.getWeight();
            }
        }
        return weight;
    }
}
