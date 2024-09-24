package com.Inheritance;

public class   BrigadeContractor extends Object implements Contractor,Traffic{
    @Override
    public void bidding() {
        System.out.println("running budding in Brigade");
    }

   // @Override
    public void wearSealBelt() {

        System.out.println("wearing seatBelt...");
    }

    @Override
    public void wearSeatBelt() {

    }
    //overirde
}
