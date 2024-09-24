package com.Inheritance;

import java.text.StringCharacterIterator;

public class Chicken  extends Bull{
    private String chickenColour;
    double quantity;
    private int no;
    String chickenType;
    private boolean isChickenIsGood;


    public void serveChicken(){
        System.out.println(" serving chicken");
    }
    public void finishChicken(){
        System.out.println(" finishing chicken");
    }
    public void prepareChicken(){
        System.out.println(" preaparing chicken");
    }
    public void eatChicken(){
        System.out.println("eating chicken ");
    }
    public void sellChicken(){
        System.out.println(" selling chicken");
    }

    public String getChickenColour(){
        return chickenColour;
    }

    public void setChickenColour(String chickenColour){
        this.chickenColour=chickenColour;
    }

    public int getNo(){
        return no;
    }
    public void setNo(int no){
        this.no=no;
    }

    public boolean getIsChickenIsGood(){
        return isChickenIsGood;
    }
    public void setChickenIsGood(boolean isChickenIsGood){
        this.isChickenIsGood=isChickenIsGood;
    }
}
