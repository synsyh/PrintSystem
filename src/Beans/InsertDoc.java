package Beans;

import java.sql.*;

/**
 * Created by sunning on 16-12-21.
 */
public class InsertDoc {
    String fileName;
    Connection conn = null;
    String sql;
    Statement stmt;
    ResultSet rs;

    public InsertDoc(String fileName) {
        this.fileName = fileName;

        //connect the MySQL database
        try {
            //加载sql数据库
            Class.forName("com.mysql.jdbc.Driver");
            String dburl = "jdbc:mysql://localhost:3306?useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(dburl, "root", "root");
            System.out.println("connection built");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            sql = "SELECT * FROM record WHERE crawled = 0";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                url = rs.getString(2);
            } else {
                //stop crawling if reach the bottom of the list
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
