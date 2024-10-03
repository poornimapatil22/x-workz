package Enum;

public class Ticket {


    public enum TicketType{

        ONLINE(200),OFFLINE(180);

        private final double  cost;

        TicketType(double cost){
            this.cost=cost;
        }

        public double getCost(){
            return cost;
        }
    }
}
