package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huozongsheng on 2016/12/20.
 */
@WebServlet(name = "Stu_sysServlet")
public class Stu_sysServlet extends HttpServlet {
    String value = null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("连接到Stusys后台");
        value = request.getParameter("name");
        System.out.println("value:"+value);
        switch(value){
            case "upload":
                System.out.println("切换到上传文件");
                request.getRequestDispatcher("stu_upload.jsp").forward(request, response);
                break;
            case "allfile":
                System.out.println("切换到文件队列");
                break;
            case "stuinfo":
                System.out.println("切换到学生个人信息");
                break;
        }
    }
}
