package Runner;

import com.TypeCasting.Hell;
import com.TypeCasting.People;
import com.TypeCasting.RudePeople;

public class HellRunner {
    public static void main(String[] args) {
        Hell hell=new Hell();
        hell.beat();

        People people=new People();
       people.beat();
       people.suffering();

        Hell hell1=new People();
        hell1.beat();


        RudePeople rudePeople=new RudePeople();
        rudePeople.kill(hell1);




    }
}
