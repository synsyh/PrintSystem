package servlet;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sunning on 16-12-21.
 */
@WebServlet(name = "UploadSetServlet")
public class UploadSetServlet extends HttpServlet {
    String color;
    String printnum;
    String size;
    HttpSession session;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session = request.getSession();
        printnum = request.getParameter("printnum");
        for(String tmp:request.getParameterValues("colorRadios"))
            color=tmp;
        for(String tmp:request.getParameterValues("sizeRadios"))
            size=tmp;
        System.out.println("success");

        switch (color){
            case ("color"):
                color="彩印";
                break;
            case("uncolor"):
                color="黑白";
                break;
        }
        session.setAttribute("color",color);
        session.setAttribute("size",size);
        session.setAttribute("printnum",printnum);
        response.sendRedirect("stu_upload_message.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
