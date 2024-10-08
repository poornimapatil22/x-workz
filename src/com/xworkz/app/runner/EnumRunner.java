package Runner;


import Enum.*;
import Enum.Product.ProductType;

public class EnumRunner {
    public static void main(String[] args) {
        CustomerDTO customer = new CustomerDTO("punitpatil@gmail.com", "punit",Product.ProductType.KITCHEN);

        // Initialize TicketBookDTO
        TicketBookDTO ticket = new TicketBookDTO("kirik party",Seat.SeatType.RECLINER,"amar", Ticket.TicketType.OFFLINE);


        System.out.println("name is:"+customer.getName());
        System.out.println("email is:"+customer.getEmail());
        System.out.println("product type is:"+customer.getProductType());


        System.out.println("movie name is:"+ticket.getMovieName());
        System.out.println("theater name is:"+ticket.getTheaterName());
        System.out.println("seatNo is:"+ticket.getSeatType().getSeatNo());
        System.out.println("ticketPrice is:"+ticket.getTicketType().getCost());
    }
}
