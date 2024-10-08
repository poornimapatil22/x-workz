package Runner;


import com.Encapsulation.Bird;
import com.Encapsulation.OtherBird;


public class BirdRunner {
    public static void main(String[] args) {
        Bird bird =new Bird();
        System.out.println(bird.getBirdCount());

        OtherBird otherBird=new OtherBird();
        otherBird.test();
        otherBird.getting();

    }
}
