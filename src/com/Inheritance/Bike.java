package com.Inheritance;

public class Bike {
   private String bikeName;
   public int bikePrice;
   public int bikeWeight=700;

  public Bike(){
       System.out.println("created new argument constructer");
   }
   public void display(){
       System.out.println("bikename is:"+bikeName);
       System.out.println("bikeprice is:"+bikePrice);
       System.out.println("bikeWeight is:"+bikeWeight);
   }

   public String getBikeName(){
      return bikeName;
   }
   public void setBikeName(String bikeName){
      this.bikeName=bikeName;
   }

}
