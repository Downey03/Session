import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/video/search")
public class SearchController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "\n" +
                "{videoId: '4856008086126592', videoTitle: 'Fantastic Negrito - When Everything Went Wrong', videoLink: 'https://www.youtube.com/watch?v=G0XE4OHoqn8', videoThumbnail: 'https://i.ytimg.com/vi/G0XE4OHoqn8/hq720.jpg?sqp=-…BACGAYgATgB&rs=AOn4CLDiwoKAxeB9vfkIEZvaLvnVgLu_0Q'}\n" +
                "{videoId: '5070428590571520', videoTitle: \"James Arthur - Say You Won't Let Go\", videoLink: 'https://www.youtube.com/watch?v=0yW7w8F2TVA', videoThumbnail: 'https://i.ytimg.com/vi/0yW7w8F2TVA/hq720.jpg?sqp=-…BACGAYgATgB&rs=AOn4CLCm5sXQfTSceCAcxrE7rTxK-_X4eA'}\n";


    }
}
