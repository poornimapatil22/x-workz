package Runner;

import com.Inheritance.MetroTrain;
import com.Inheritance.SubUrbanTrain;
import com.Inheritance.Train;

public class TrainRunner {

    public static void main(String[] args) {
        Train train=new Train("Chikodi","belgavi");
        train.display();


        MetroTrain metroTrain=new MetroTrain();
        metroTrain.show();

        SubUrbanTrain subUrbanTrain=new SubUrbanTrain();
        subUrbanTrain.details();



    }
}
