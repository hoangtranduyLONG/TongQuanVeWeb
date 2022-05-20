import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/c022h1")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter printWriter=response.getWriter();
//        printWriter.print("<html>Hi</html>");
    int x =Integer.parseUnsignedInt(request.getParameter("a"))    ;
        int y =Integer.parseUnsignedInt(request.getParameter("b"))    ;
        int sum=x+y;
        PrintWriter printWriter=response.getWriter();
   printWriter.print("<html>"+sum+"</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter printWriter=response.getWriter();
//        printWriter.print("<html>Hi</html>");
        int x =Integer.parseUnsignedInt(request.getParameter("a"))    ;
        int y =Integer.parseUnsignedInt(request.getParameter("b"))    ;
        int sum=x+y;
        PrintWriter printWriter=response.getWriter();
        printWriter.print("<html>"+sum+"</html>");
    }
    }


