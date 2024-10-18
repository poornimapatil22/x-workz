import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
    public class Ordering  extends HttpServlet {


        public Ordering(){

            System.out.println("order is running.....");
        }

        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
        {
            System.out.println("running order in order");
            String customername=req.getParameter("customername");
            String item=req.getParameter("item");
            String quantity=req.getParameter("quantity");
            System.out.println("order is success");




            resp.setContentType("Order.html");

            PrintWriter out = resp.getWriter();
            out.println(customername );
            out.println( item );
            out.println( quantity );

        }
}


