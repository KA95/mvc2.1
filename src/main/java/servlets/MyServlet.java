package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sergio on 1/17/2015.
 */
public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //redirect the user depending on the value of the 'go' param
        String destination = getInitParameter("go");
        String contextPath = request.getContextPath();

        if(destination == null || destination.equals(""))
            throw new ServletException(
                    "Missing or invalid 'go' parameter in " +
                            getClass().getName());

        if(destination.equals("weather"))
            //ensure URL rewriting
            response.sendRedirect(response.encodeRedirectURL(contextPath + "/weather") );

        if(destination.equals("maps"))
            //ensure URL rewriting
            response.sendRedirect(response.encodeRedirectURL(contextPath + "/maps") );
    }
}
