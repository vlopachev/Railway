package com.epam.railway.transport;

public enum TypeLocomotive {
    L2ES4K(5920,192.0),
    L3ES4K(8880,288.0);

    private final int power;
    private final double weight;

    TypeLocomotive(int power, double weight) {
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public double getWeight(){
        return weight;
    }
}
