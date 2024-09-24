package com.DefaultMethods;

public interface FlowerShop {

    void selling();

    default void dontSell(){
        System.out.println("not selling flowers");
    }
}
