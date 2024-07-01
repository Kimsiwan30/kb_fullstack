package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("효석");
        ImmutableUser user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);


        user2 = user2.setName("시완");   //user2에는 참조만하는거라 다시 use2의 넣어줘야함
        //user2 = new ImmutableUser("시완"); 다시 생성하는과정
        // user2.setName("시완");  불변에서 setName 사용 불가 그러므로 다시 생성해줘야함
        System.out.println("user2 의 이름을 '시완' 으로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
