package liang;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", description = "blabla", urlPatterns = "/")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
//        out.println("Welcome ASCENDING");
        System.out.println("We are in HelloServlet");

        //test listener
        HttpSession session = req.getSession();
        session.setAttribute("url", "mkyong.com"); //attributeAdded() is executed
        session.setAttribute("url", "mkyong2.com"); //attributeReplaced() is executed
        session.removeAttribute("url"); //attributeRemoved() is executed

        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("new.html");
//        dispatcher.forward(request,response);
    }


}