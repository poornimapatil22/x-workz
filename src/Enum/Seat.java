package Enum;

public class Seat{
    public enum SeatType{
        RECLINER("R1"),PREMIUM("P1"),EXECUTIVE("E1");


        private final String seatNo;

        SeatType (String seatNo){
            this.seatNo=seatNo;
        }

        public String getSeatNo(){
            return seatNo;
        }
    }
}
