package com.OverRide;


 public class Hotel {


     private String hotelName;

     private String order;

     private int noOfWorkers;

     private String ownerName;

     public Hotel(String hotelName, String order) {

         this.hotelName = hotelName;

         this.order = order;


     }



    public Hotel(String ownerName, int noOfWorkers){

             this.ownerName = ownerName;

             this.noOfWorkers = noOfWorkers;


         }





     public void display(String hotelName, String order) {

         System.out.println("Hotel Name:" + hotelName);
         System.out.println("Order:" + order);
     }



     public void display(int noOfWorkers, String ownerName) {

         System.out.println(" Noofworkers:" + noOfWorkers);
         System.out.println("ownerName:" + ownerName);


     }
 }
