import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response){
        //取名doGet是为get方法作出回应   servlet中文意思是小服务程序
        try {
            //网页页面输出
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
