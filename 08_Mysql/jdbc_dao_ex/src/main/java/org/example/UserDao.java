package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    static Connection conn = null;

    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);

            if (conn != null) {
                System.out.println("DB 접속에 성공!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String email, String password) {
        String sql = "insert into user (email,password) values (?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            pstmt.setString(2, password);

            int affetedRows = pstmt.executeUpdate();

            if (affetedRows > 0) {
                System.out.println("회원 추가 성공!");
            } else {
                System.out.println("회원 추가 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        List<UserVo> listUsers = new ArrayList<>();
        String sql = "select * from user";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getNString("email");
                String password = rs.getString("password");

                UserVo user = new UserVo(id, email, password);
                listUsers.add(user);
                System.out.println(user);
            }
           // listUsers.forEach((user) -> System.out.println(user));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(int id, String email, String password) {
        String sql = "Update user set password = ? where email = ? where id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            pstmt.setInt(3, id);

            int affetedRows = pstmt.executeUpdate();
            if (affetedRows > 0) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "delete from user where id = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setInt(1, id);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 삭제 성공");
            } else {
                System.out.println("회원 삭제 실패");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void join(){
        String sql ="select users.id, users.email, users.password";

    }


}
