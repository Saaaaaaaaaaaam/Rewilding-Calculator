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

    public double Calculate(int stage, double input){
        if(stage==0){
        return AirMiles(input);
        }else if(stage==1){

        }



        return -1;
    }

    private double AirMiles(double miles){
        return miles*airCarbon;
    }
}
