package TreeDemo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by student on 8/25/17.
 */
@WebServlet(
        urlPatterns = {"/home"}
)
public class HomePageServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TreeDemo demo = new TreeDemo();
        ArrayList<String> outputList = demo.runDemo();

        request.setAttribute("defaultResults", outputList.get(0));
        request.setAttribute("allOrangeResults", outputList.get(1));
        request.setAttribute("noOrangeResults", outputList.get(2));

        // Forward to home page with processed name data
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);

    }
}
