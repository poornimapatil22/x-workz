package Runner;

import com.Inheritance.Bike;
import com.Inheritance.Shop;

public class ShopRunner {

    public static void main(String[] args) {



            Bike bike = new Bike();
            bike.bikePrice=90000;
            bike.display();
            bike.setBikeName("ktm");
        System.out.println( "bike name is:"+bike.getBikeName());


            Shop shop=new Shop();
            shop.bikePrice=80000;
            shop.display();
            shop.setBikeName("cbz");
        System.out.println( "bike name is:"+shop.getBikeName());




    }
        }

