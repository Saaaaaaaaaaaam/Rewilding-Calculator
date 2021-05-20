package com.example.rewilding_calculator;

public class Calculation {
    final static double airCarbon=23;
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private double cost=0;

    public double getAirmiles() {
        return airmiles;
    }

    public void setAirmiles(double airmiles) {
        this.airmiles = airmiles;
    }

    private double airmiles;



    public double getAirMiles(double miles){
        airmiles=miles*airCarbon;
        return airmiles;
    }
}
