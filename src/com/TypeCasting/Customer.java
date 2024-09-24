package com.TypeCasting;

public class Customer {

    //parent or raghu
    public void order(Bakery bakery1)
    {
        //subclass or parent class
        if(bakery1 instanceof RaghuBakery)
        {

            RaghuBakery raghuBakery=(RaghuBakery) bakery1;
            raghuBakery.preOrder();
        }

    }


    public void order(String item)
    {

    }
}
