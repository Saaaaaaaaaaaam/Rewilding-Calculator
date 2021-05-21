package com.example.rewilding_calculator;

//import static java.lang.reflect.Array.getDouble;

public class Calculation {
//    final static double airCarbon=getDouble(R.data.Air_Carbon; //0.115 kilograms of carbon per
    final static double airCarbon=0.115;//0.115 kilo carbon per passenger km https://www.carbonindependent.org/22.html
    final static double carCarbon=0.650; //0.650 kilo carbon per km total guess, will need clarification
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private double cost=0;

    public double getAirmiles() {
        return airMiles;
    }

    public void setAirmiles(double airmiles) {
        this.airMiles = airmiles;
    }

    private double airMiles;


    public double getCarMiles() {
        return carMiles;
    }

    public void setCarMiles(double carMiles) {
        this.carMiles = carMiles;
    }

    private double carMiles;


    public double getAirMiles(double miles){
        airMiles=miles*airCarbon;
        return airMiles;
    }
    public double getCarMiles(double miles){
        carMiles = miles*carCarbon;
        return carMiles;
    }
}
