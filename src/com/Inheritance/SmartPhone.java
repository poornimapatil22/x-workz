package com.Inheritance;

public class SmartPhone extends Halwa {
   private String smartPhoneBrand;
   private int quantity;
    String colour;
    double price;


    public void sellSmartPhone(){
        System.out.println(" selling Smartphone ");
    }

    public void bringSmartPhone(){
        System.out.println("bring smartphone");
    }



    public String getSmartPhoneBrand(){
        return smartPhoneBrand;
    }
    public void setSmartPhoneBrand(String smartPhoneBrand){
        this.smartPhoneBrand=smartPhoneBrand;
    }


    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }


    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }


    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }

}
