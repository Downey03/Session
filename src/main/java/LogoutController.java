import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;

@WebServlet("/user/logout")
public class LogoutController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("logout hit");
        HttpSession session = req.getSession();
        Cookie cookie =(Cookie) Arrays.stream(req.getCookies()).filter(cookie1 -> cookie1.getName().equals("JSESSIONID"));
        cookie.setMaxAge(0);
        session.invalidate();
    }
}
