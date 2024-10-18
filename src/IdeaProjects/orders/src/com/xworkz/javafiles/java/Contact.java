import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(loadOnStartup = 1,urlPatterns = "/enter")
        public class Contact extends HttpServlet {


            public Contact(){

                System.out.println("contact is running.....");
            }

            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
            {
                System.out.println("running contact in order");
                String name=req.getParameter("name");
                String emailid=req.getParameter("emailid");
                String age=req.getParameter("age");
                String mobileno=req.getParameter("mobileno");
                System.out.println("contact is success");



                resp.setContentType("Contact.html");

                PrintWriter out = resp.getWriter();
                out.println( name );
                out.println( emailid );
                out.println(age );
                out.println( mobileno);

            }
        }



