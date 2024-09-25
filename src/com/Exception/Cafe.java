package com.Exception;

public class Cafe extends RuntimeException{
    public Cafe(String name){
        System.out.println("cafe is closed");
    }
}
