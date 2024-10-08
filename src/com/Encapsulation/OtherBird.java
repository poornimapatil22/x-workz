package com.Encapsulation;


public class OtherBird {
   Bird bird =new Bird();


   public void test()
   {
      bird.setBirdCount(4);

   }

   public void getting(){

      System.out.println(bird.getBirdCount());
   }

}
