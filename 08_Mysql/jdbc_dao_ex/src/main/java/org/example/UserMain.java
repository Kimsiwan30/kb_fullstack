package org.example;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();


        UserVo tetz = new UserVo(1, "tetz", "1234");

        System.out.println(tetz);
        //System.out.println(UserDao.conn);
    }
    //static을 쓰면 인스턴스화를 안해도 static을 쓰는순간 생성이 되기때문
    //사용가능 하지만 안쓰면 UserDao가 생성이 되어야 사용가능하므로 인스턴스화를
    //시켜줘야 사용이 가능하다
}
