package com.epam.railway.logic;

import com.epam.railway.entity.CargoWagon;
import com.epam.railway.entity.Locomotive;
import com.epam.railway.entity.RailwayTransport;
import com.epam.railway.entity.TypeRailwayTransport;

import java.util.Calendar;
import java.util.List;

public final class RailwayUtils {
    public final static double WEIGHT_AVERAGE_PERSON = 0.062; //ton

    // Locomotives
    public final static int    POWER_2ES4K = 5920; //kW
    public final static int    POWER_3ES4K = 8880;
    public final static double WEIGHT_2ES4K = 192;
    public final static double WEIGHT_3ES4K = 288;
    public final static double SAND_STOCK_2ES4K = 2;
    public final static double SAND_STOCK_3ES4K = 3;
    // Covered wagon
    public final static double WEIGHT_COVERED_WAGON = 26.0;
    public final static double PAYLOAD_COVERED_WAGON = 68.0;
    // Open wagon
    public final static double WEIGHT_OPEN_WAGON = 23.0;
    public final static double PAYLOAD_OPEN_WAGON = 71.0;
    // Platform wagon
    public final static double WEIGHT_PLATFORM_WAGON = 23.5;
    public final static double PAYLOAD_PLATFORM_WAGON = 71.0;
    // Tank wagon
    public final static double WEIGHT_TANK_WAGON = 27.0;
    public final static double PAYLOAD_TANK_WAGON = 67.0;
    // Hopper wagon
    public final static double WEIGHT_HOPPER_WAGON = 23.0;
    public final static double PAYLOAD_HOPPER_WAGON = 70.0;
    // Post wagon
    public final static double WEIGHT_POST_WAGON = 46.7;
    public final static double PAYLOAD_POST_WAGON = 20.0;
    public final static int    SEATS_POST_WAGON = 6;
    // Baggage wagon
    public final static double WEIGHT_BAGGAGE_WAGON = 52.3;
    public final static double PAYLOAD_BAGGAGE_WAGON = 18.3;
    public final static int    SEATS_BAGGAGE_WAGON = 2;
    // Sleeping wagon
    public final static double WEIGHT_SLEEPING_WAGON = 60.5;
    public final static int    SEATS_SLEEPING_WAGON = 36;
    // Couchette wagon
    public final static double WEIGHT_COUCHETTE_WAGON = 56.0;
    public final static int    SEATS_COUCHETTE_WAGON = 54;


    public static boolean isEnoughPowerLocomotiveForWagons(List<RailwayTransport> train){
        if (train != null){
            Locomotive locomotive = null;
            if (train.get(0).getClass() == Locomotive.class){
                locomotive = (Locomotive) train.get(0);
            } else if (train.get(train.size() - 1).getClass() == Locomotive.class){
                locomotive = (Locomotive) train.get(train.size() - 1);
            }
            if (locomotive != null){
                if (locomotive.getPower() - getWeightTrain(train) > 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkUniformityTrain(List<RailwayTransport> train){
        boolean ifSo = false;
        for (RailwayTransport transport: train){
            if (transport.getTypeRailwayTransport() == TypeRailwayTransport.LOCOMOTIVE ||
                    transport.getTypeRailwayTransport() == TypeRailwayTransport.CARGO_WAGON){
                ifSo = true;
            } else {
                ifSo = false;
                break;
            }
        }
        if (ifSo){
            return ifSo;
        }
        for (RailwayTransport transport: train){
            if (transport.getTypeRailwayTransport() == TypeRailwayTransport.LOCOMOTIVE
                    || transport.getTypeRailwayTransport() == TypeRailwayTransport.PASSENGER_WAGON
                    || transport.getTypeRailwayTransport() == TypeRailwayTransport.SERVICE_WAGON){
                ifSo = true;
            } else {
                ifSo = false;
                break;
            }
        }
        return ifSo;
    }


    private static double getWeightTrain(List<RailwayTransport> train) {
        double weight = 0;
        for (RailwayTransport transport: train){
            weight += transport.getFullWeight();
        }
        return weight;
    }


    private RailwayUtils() {
    }
}
