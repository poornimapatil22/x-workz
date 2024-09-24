package com.TypeCasting;

public class RudePeople {
    public void kill(Hell hell1){
        if(hell1 instanceof People){
            People people1=(People)hell1;
            people1.suffering();
        }
    }
}
