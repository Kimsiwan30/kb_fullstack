package org.scoula.user;

import org.scoula.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 회원 정보 입력 받기
//        System.out.print("추가할 회원의 ID : ");
//        String id = sc.nextLine();
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        System.out.print("비밀번호 : ");
//        String password = sc.nextLine();
//        System.out.print("나이 : ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.print("멤버쉽 여부 (true/false) : ");
//        boolean membership = sc.nextBoolean();
//        sc.nextLine();
//
//        User newUser = new User( id, name, password, age, membership);

//        // 회원 정보 삭제 구현
//        System.out.print("삭제할 회원의 ID : ");
//        int deleteId = sc.nextInt();
//
//        // 삭제 기능을 실행
//        ManageUser manageUser = new ManageUser();
//        manageUser.deleteUser(deleteId);


        ManageUser manageUser = new ManageUser();
        manageUser.getAllUsers();


        // 데이터베이스 접속
        Connection conn = JDBCUtil.getConnection();

//        String sql = "INSERT INTO user_table (userid, name, password, age, membership) VALUES (?,?,?,?,?)";
//
//        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
//            pstmt.setString(1, newUser.getUserid());
//            pstmt.setString(2, newUser.getName());
//            pstmt.setString(3, newUser.getPassword());
//            pstmt.setInt(4, newUser.getAge());
//            pstmt.setBoolean(5, newUser.isMembership());
//            pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//        ManageUser manageUser = new ManageUser();
//        manageUser.addUser(newUser);



        System.out.println("회원이 성공적으로 추가 되었습니다!");

    }
}
