import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login controller hit");
        resp.setStatus(200);
        req.getSession().setMaxInactiveInterval(120);
        req.getSession().setAttribute("user","userAvailable");
        req.getRequestDispatcher("/").forward(req,resp);
    }
}
