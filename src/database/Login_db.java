package database;

import sun.util.calendar.BaseCalendar;

import java.sql.*;
import java.util.*;
import java.util.Date;

/**
 * Created by huozongsheng on 2016/12/4.
 */
public class Login_db {
    Connection conn = null;
    Statement statement = null;
    String sql = null;

    public Login_db(){
        try {
            //加载sql数据库
            Class.forName("com.mysql.jdbc.Driver");
            String dburl = "jdbc:mysql://localhost:3306?useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(dburl, "root", "");
            System.out.println("连接建立");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void createDB(String name) throws SQLException {
        sql = "CREATE DATABASE IF NOT EXISTS "+name;
        statement = conn.createStatement();
        statement.executeUpdate(sql);

        sql = "USE "+name;
        statement = conn.createStatement();
        statement.executeUpdate(sql);
    }
    public void createTable(String sql) throws SQLException {
        this.sql = sql;
        statement = conn.createStatement();
        statement.executeUpdate(this.sql);
    }
    public ResultSet getRes(String query) throws SQLException {
        statement = conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    public ArrayList<String[]> GetPrint () throws SQLException {
        ResultSet rs = null;
        //获取所有的打印店及信息
        ArrayList<String[]> store = new ArrayList<>();
        //[0]打印店名称 [1]打印店编号
        String [] temp = new String[2];
        //sql查询语句
        this.sql = "SELECT * FROM printlogin";
        statement = conn.createStatement();
        rs = statement.executeQuery(sql);
        while(rs.next()){
            temp[0] = rs.getString("name");
            temp[1] = rs.getString("id");
            store.add(temp);
        }

        return store;
    }
    /*?????????????????????????*/
    private long CreateFileId(){
        Date realtime = new Date();
        System.out.println(realtime.getTime());
        return realtime.getTime();
    }
    /*?????????????????????????*/
    public void InsertFileName (){
        //此处插入文件名字 id
    }
    /*?????????????????????????
    * 此处缺少学生实名认证的功能*/
    public String login (String id, String password) throws SQLException {
        //判断登陆人
        //长度1 管理员  长度5 打印店  长度11 学生
        statement = conn.createStatement();
        switch (id.length()){
            case 1 :
                sql = "SELECT password FROM rootlogin WHERE id ="+ id;
                ResultSet res = statement.executeQuery(sql);
                while (res.next()){
                    if (res.getString("password").equals(password))
                        return id;
                }
                break;
            case 5 :
                sql = "SELECT password FROM printlogin WHERE id ="+ id;
                ResultSet resP = statement.executeQuery(sql);
                while (resP.next()){
                    if (resP.getString("password").equals(password))
                    return id;
                }
                break;
                default:
                    break;
        }

        return null;
    }
}
