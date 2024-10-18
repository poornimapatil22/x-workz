import javax.script.ScriptContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


        @WebServlet(loadOnStartup = 1,urlPatterns = "/enter")
        public class Register extends HttpServlet {


            public Register(){

                System.out.println("Register is running.....");
            }

            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
            {
                System.out.println("running Register in order");
                String firstname=req.getParameter("firstname");
                String lastname=req.getParameter("lastname");
                String email=req.getParameter("email");
                String password=req.getParameter("password");
                String confirmpassword=req.getParameter("confirmpassword");
                String mobileno=req.getParameter("mobileno");
                String gender=req.getParameter("gender");
                String state=req.getParameter("state");
                String city=req.getParameter("city");
                System.out.println("Register is success");

                resp.setContentType("Register.html");

                PrintWriter out = resp.getWriter();
                out.println( firstname );
                out.println( lastname );
                out.println( email );
                out.println(password );
                out.println(confirmpassword );
                out.println( mobileno);
                out.println(gender );
                out.println(state);
                out.println(city);

            }
        }



