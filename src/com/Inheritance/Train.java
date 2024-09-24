package com.Inheritance;

public class Train {


    public double no;
    public String source;
    public String destination;


    public Train() {


    System.out.println("created train using no ang constructor");

    }

        public Train(String source, String destination) {

            System.out.println("created train using string, string constructor");


            this.source = source;
            this.destination = destination;

        }





        public void display() {


            System.out.println("source is:"+this.source);
            System.out.println("dest is:"+this.destination);


        }
}
