package Enum;
import Enum.Ticket;
import Enum.Seat;

public class TicketBookDTO {

    private String movieName;
    private  String theaterName;
    private Ticket.TicketType ticketType;
    private Seat.SeatType seatType;


    public TicketBookDTO(String movieName, Seat.SeatType seatType, String theaterName, Ticket.TicketType ticketType) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.ticketType = ticketType;
        this.seatType=seatType;
    }


    public String getMovieName(){
        return movieName;
    }

    public String getTheaterName(){
        return theaterName;
    }

    public Ticket.TicketType getTicketType(){
        return ticketType;
    }

    public Seat.SeatType getSeatType() {
        return seatType;
    }
}
