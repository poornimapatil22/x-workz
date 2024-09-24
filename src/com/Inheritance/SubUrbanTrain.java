package com.Inheritance;



    public class SubUrbanTrain extends Train{
        public String source;

        public String destination;

        public SubUrbanTrain() {
            System.out.println("created suburban train using no-arg constructor");
        }


    public SubUrbanTrain(String source, String destination){
        super(source,destination);
            System.out.println("Created SuburbanTrain using string string constructor");

            this.source=source;

            this.destination=destination;


    }
        Train  train= new Train("yashvantpur","mejestic");

        public void details() {
            if (train != null) {
                train.display();
            } else {
                System.out.println("train is null");
            }
        }

        }