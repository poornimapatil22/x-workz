import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(loadOnStartup = 1,urlPatterns = "/submit")
        public class Search extends HttpServlet {


            public Search(){

                System.out.println("order is running.....");
            }

            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
            {
                System.out.println("running order in order");
                String emailid=req.getParameter("emailid");
                System.out.println("Search is success");

                resp.setContentType("Search.html");

                PrintWriter out = resp.getWriter();

                out.println( emailid );




            }
        }


