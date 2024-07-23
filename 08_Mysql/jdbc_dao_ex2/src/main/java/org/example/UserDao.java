package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public void addUser(UserVo newUser) {
        try {
            // 1.Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 ok");

            // 2.DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. sql문 생성
            String sql = "insert into users (email, password) values (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newUser.getEmail());
            pstmt.setString(2, newUser.getPassword());
            System.out.println("3. sql 문 생성 ok");

            // 4. sql 문 전송 및 실행
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 추가 성공");
            } else {
                System.out.println("회원 추가 실패");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<UserVo> readUser() {
        List<UserVo> userList = new ArrayList<>();

        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 ok");

            // 2.DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3.sql 문 생성
            String sql = "select * from users";
            Statement stmt = conn.createStatement();
            System.out.println("3. sql문 생성 ok");

            //4. sql 문 전송
            ResultSet rs = stmt.executeQuery(sql);
            // 결과 데이터를 전부 순화하는 while 문
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userEmail = rs.getString("email");
                String userPassword = rs.getString("password");

                // 결과 데이터를 바탕으로 회원 정보 객체(=UserVo)를 만들고 해당 객체
                UserVo user = new UserVo(userId, userEmail, userPassword);
                userList.add(user);

            }

            // 5. 자원 해제
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. 결과 리턴
        // 데이터가 전부 추가된 리스트를 리턴!
        // 통신이 잘못되면 try/catch 구문이 정상적으로 실행이 안되므로 빈 리스트가 리턴
        return userList;

    }

    public void updateUser(int userId, String userEmail, String userPassword) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 ok");

            // 2.DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "update users set email=?, password=? where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            pstmt.setString(2, userEmail);
            pstmt.setString(3, userPassword);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 정보 수정 성공");
            } else {
                System.out.println("회원 정보 수정 실패");
            }
            pstmt.close();
            conn.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) {
        try{
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 ok");

            // 2.DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "delete from users where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);

            int affetedRows = pstmt.executeUpdate();
            if (affetedRows > 0) {
                System.out.println("회원정보 삭제 성공");
            }else{
                System.out.println("회원정보 삭제 실패");
            }
            pstmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
