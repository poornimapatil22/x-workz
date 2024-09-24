package com.DefaultMethods;

public  class Flower implements FlowerShop {
    public void sell(){
        System.out.println(" sell flower");
    }

    @Override
    public void selling(){
        System.out.println("selling flowers by overriding it in class by taking it from the interface");
    }



//    @Override
//    public void dontsell(){
//        System.out.println("again not selling flowers");
//    }

}
