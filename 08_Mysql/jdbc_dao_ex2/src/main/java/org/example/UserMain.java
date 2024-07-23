package org.example;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // 회원 추가, 이제는 객체를 전달
        //UserVo newUser = new UserVo(0, "tetz2", "1234");
        //userDao.addUser(newUser);

//        List<UserVo> users = userDao.readUser();
//
//        for (UserVo user : users) {
//             System.out.println(user);
//            System.out.println("아이디는 : " + user.getId() + " / ");
//            System.out.println("이메일은 : " + user.getEmail() + " / ");
//            System.out.println("비밀번호는 : " + user.getPassword() + " / \n");
//        }

        userDao.updateUser(4, "tet3", "1754");
    }
}
