package servlet;

import database.Login_db;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by huozongsheng on 2016/12/11.
 */
@WebServlet(name = "loginServlet")
public class loginServlet extends HttpServlet {
    String userid = null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        Login_db login_db = new Login_db();
        try {
            login_db.createDB("printsys");
            System.out.println("连接数据库成功");
            userid = login_db.login(request.getParameter("username"),request.getParameter("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //判断数据库是否查到到该用户的用户名和密码
        System.out.println("未加入学生登陆，添加学生登陆及数据库写入功能");
        if (userid==null)
            request.getRequestDispatcher("login.jsp").forward(request, response);
        else if (userid.length()==5)
        request.getRequestDispatcher("printSys.jsp").forward(request, response);
        else if (userid.length()==1)
            request.getRequestDispatcher("Rootuser.jsp").forward(request, response);
        else
            request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
