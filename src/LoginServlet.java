import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String html=null;
        if("admin".equals(name)&&"123".equals(password))//避免空指针
//            html="<div style='color:green'>success</div>";
            request.getRequestDispatcher("success.html").forward(request,response);
        else
//            html="<div style='color:red'>fail</div>";
            response.sendRedirect("fail.html");
        PrintWriter pw=response.getWriter();
        pw.println(html);

        //控制台输出
        System.out.println("name:"+name);
        System.out.println("password:"+password);

    }
}
