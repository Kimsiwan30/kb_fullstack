package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    static Connection conn = null;
    static{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);

            if(conn != null){
                System.out.println("DB 접속에 성공!");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void close(){
        try{
            if(conn != null){
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void create(String email, String password){
        String sql = "insert into user (email,password) values (?,?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, email);
            pstmt.setString(2, password);

            int affetedRows = pstmt.executeUpdate();

            if(affetedRows > 0){
                System.out.println("회원 추가 성공!");
            } else {
                System.out.println("회원 추가 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
