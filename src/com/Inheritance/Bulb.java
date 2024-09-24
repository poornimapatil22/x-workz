package com.Inheritance;

public class Bulb {
   private String bulbBrand;
   public int bulbNo;
    public void onOrOff(){
        System.out.println(" bulb is in bulb");

    }
    public String getBulbBrand(){
        return bulbBrand;
    }
    public void setBulbBrand(String bulbBrand){
        this.bulbBrand=bulbBrand;
    }
}
