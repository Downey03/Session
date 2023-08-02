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

        Cookie[] cookies = req.getCookies();
        for(Cookie c: cookies){
            if(c.getName().equals("JSESSIONID")){
                System.out.println("found jsessionid invalidating it ");
                c.setMaxAge(0);
            }
        }
        System.out.println(req.getSession().getId());
        req.getSession().invalidate();
        System.out.println(req.getSession().getId());
        System.out.println("exiting logout controller");
    }
}
