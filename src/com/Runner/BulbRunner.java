package Runner;

import com.Inheritance.*;


public class BulbRunner {
    public static void main(String[] args) {
        Halwa halwa=new Halwa();
        halwa.distributeHalwa();
        halwa.finishHalwa();


        halwa.setHalwaColour("red");
        System.out.println(halwa.getHalwaColour());
        halwa.setHalwaCost(60);
        int halc=halwa.getHalwaCost();
        System.out.println(halc);
        halwa.setHalwaQuantity(80.5);
        System.out.println(halwa.getHalwaQuantity());

        halwa.onOrOff();
        halwa.setBulbBrand("iris");
        System.out.println( halwa.getBulbBrand());


        Bulb bulb=new Bulb();
        bulb.onOrOff();
        bulb.setBulbBrand("led");
        System.out.println(bulb.getBulbBrand());

        SmartPhone smartPhone=new SmartPhone();
        smartPhone.bringSmartPhone();
        smartPhone.sellSmartPhone();
        smartPhone.setSmartPhoneBrand("samsung");
        System.out.println(smartPhone.getSmartPhoneBrand());
        smartPhone.setQuantity(12500);
        System.out.println(smartPhone.getQuantity());


        smartPhone.distributeHalwa();
        smartPhone.finishHalwa();
        smartPhone.setHalwaCost(50);
        System.out.println(smartPhone.getHalwaCost());
        smartPhone.setHalwaColour("pink");
        System.out.println(smartPhone.getHalwaColour());

        Bull bull =new Bull();
        bull.sell();
        bull.purchase();
        bull.avoidBulls();
        bull.runBulls();
        bull.stopBulls();

        bull.setColorOfBull("white");
        System.out.println(bull.getColorOfBull());
        bull.setWeightInKwintles(7);
        System.out.println(bull.getWeightInKwintles());
        bull.setPrice(90000.00);
        System.out.println(bull.getPrice());


        bull.sellSmartPhone();
        bull.bringSmartPhone();
        bull.setSmartPhoneBrand("samsung");
        System.out.println(bull.getSmartPhoneBrand());
        bull.setQuantity(12500);
        System.out.println(bull.getQuantity());

        Chicken chicken=new Chicken();
        chicken.eatChicken();
        chicken.finishChicken();
        chicken.setChickenColour("red");
        System.out.println(chicken.getChickenColour());
        chicken.setChickenIsGood(false);
        System.out.println( chicken.getIsChickenIsGood());

        chicken.avoidBulls();
        chicken.runBulls();
        chicken.stopBulls();

        chicken.setColorOfBull("white");
        System.out.println(chicken.getColorOfBull());
        chicken.setWeightInKwintles(7);
        System.out.println(chicken.getWeightInKwintles());
        chicken.setPrice(90000.00);
        System.out.println(chicken.getPrice());





    }
}
