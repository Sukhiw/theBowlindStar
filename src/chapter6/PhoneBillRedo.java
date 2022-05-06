package chapter6;

import java.security.PublicKey;

public class PhoneBillRedo {

    private double id;
    private double baseCost;
    private double numberOfAllottedMinutes;
    private double numberOfMinutesUsed;

    public PhoneBillRedo(){
        id = 0;
        baseCost = 200;
        numberOfAllottedMinutes = 500;
        numberOfMinutesUsed = 300;
    }

    public PhoneBillRedo(int id){
        this.id = id;
        baseCost = 200;
        numberOfAllottedMinutes = 500;
        numberOfMinutesUsed = 800;
    }

    public PhoneBillRedo(double id, double baseCost, double numberOfMinutesUsed, double numberOfAllottedMinutes){
        setId(id);
        setBaseCost(baseCost);
        setNumberOfMinutesUsed(numberOfMinutesUsed);
        setNumberOfAllottedMinutes(numberOfAllottedMinutes);

    }

    public double getId(){
        return id;
    }

    public void setId(double id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public void setNumberOfAllottedMinutes(double numberOfAllottedMinutes){
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
    }

    public double getNumberOfAllottedMinutes(){
        return numberOfAllottedMinutes;
    }

    public void setNumberOfMinutesUsed(double numberOfMinutesUsed){
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double getNumberOfMinutesUsed(){
        return numberOfMinutesUsed;
    }

    public double CalculateOverage(){
        if (numberOfMinutesUsed >= numberOfAllottedMinutes){
            return 0;
        }

        double OverageRate = 0.25;
        double OverageMinutes = numberOfMinutesUsed - numberOfAllottedMinutes;
        return OverageMinutes * OverageRate;
    }

    public double CalculateTax (){
        double totalRate = 0.15;
        return totalRate *  (baseCost + CalculateOverage());
    }

    public double CalculateTotal(){
        return baseCost + CalculateOverage() + CalculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: "+id);
        System.out.println("Base Rate: $"+ baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", CalculateOverage()));
        System.out.println("Tax : $" + String.format("%.2f", CalculateTax()));
        System.out.println("Total : $"+ String.format("%.2f", CalculateTotal()));

    }




}
