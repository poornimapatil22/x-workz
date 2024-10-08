package Runner;
import com.TypeCasting.Customer;
import com.TypeCasting.Bakery;
import com.TypeCasting.RaghuBakery;


public class BakeryRunner {

    public static void main(String[] args) {
        Bakery bakery=new Bakery();
        bakery.delivery();

        Bakery bakery1=new RaghuBakery();//only deliver method


        RaghuBakery  raghuBakery=new RaghuBakery();//both the methods from bakery and raghuBakery


        Customer customer=new Customer();
        customer.order(bakery1);


       // customer.order(raghuBakery);

    }
}
