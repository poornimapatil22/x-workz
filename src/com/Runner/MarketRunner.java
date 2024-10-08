package Runner;

import com.Inheritance.BrigadeContractor;
import com.Inheritance.Contractor;
import com.Inheritance.SuperMarket;
import com.Inheritance.Traffic;

public class MarketRunner {

    public static void main(String[] args) {

        SuperMarket superMarket=new SuperMarket();
        superMarket.buy();//parent
//        superMarket.sell();////child


//        Contractor contractor=new BrigadeContractor();
//        contractor.bidding();

        Traffic traffic=new BrigadeContractor();
        traffic.wearSeatBelt();

        Object object=new BrigadeContractor();


        BrigadeContractor brigadeContractor=new BrigadeContractor();
        brigadeContractor.wearSealBelt();


    }
}
