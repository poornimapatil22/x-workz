package Runner;

import com.OverRide.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new Hotel("ullas","tea");
        System.out.println(hotel);

        hotel.display("chaitan","juice");

        hotel.display(6,"aksah");

    }
}
