package com.Inheritance;

public class Halwa  extends Bulb{
   private  String halwaColour;
  private   int halwaCost;
   private double halwaQuantity;


    public  void distributeHalwa(){
        System.out.println(" distributing halwa s in distributehalwa");
    }

    public void finishHalwa(){
        System.out.println("finishing halwa s in finishinghalwa");
    }



    public int getHalwaCost(){

        return halwaCost;
    }

    public void setHalwaCost(int halwaCost) {
        this.halwaCost=halwaCost;
    }


    public String getHalwaColour(){
        return halwaColour;
    }
    public void setHalwaColour(String halwaColour){
        this.halwaColour=halwaColour;
    }



    public double getHalwaQuantity(){
        return halwaQuantity;
    }

    public void setHalwaQuantity(double halwaQuantity){
        this.halwaQuantity=halwaQuantity;
    }
}
