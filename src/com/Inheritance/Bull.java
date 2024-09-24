package com.Inheritance;

public class Bull extends SmartPhone{
   private String colorOfBull;
   String name;
   private int weightInKwintles;
   private double price;
   String typeOfBull;

    public void sell(){
        System.out.println(" selliing bull");
    }
    public void purchase(){
        System.out.println(" purchasing bull");
    }
    public void runBulls(){
        System.out.println(" running bulls");
    }
    public void stopBulls(){
        System.out.println(" stoping bulls");
    }
    public void avoidBulls(){
        System.out.println(" avoiding bulls");
    }



    public String getColorOfBull(){
        return colorOfBull;
    }
    public void setColorOfBull(String colorOfBull){
        this.colorOfBull=colorOfBull;
    }

    public int getWeightInKwintles(){
        return weightInKwintles;
    }
    public void setWeightInKwintles(int weightInKwintles){
        this.weightInKwintles= weightInKwintles;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

}
