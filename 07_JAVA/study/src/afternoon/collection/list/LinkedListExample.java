package afternoon.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // LinkedList 가 제일 유리한 케이스
        list.addFirst(0);

        //둘이 동일한 케이스
        list.addLast(6);

        list.add(3, 22);

        System.out.println("list = " + list);

        // 검색
        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        int midElement = list.get(4);      // 첫번쨰 두번째는 처음과 끝이라 빨리 찾을수 있고
                                           // 마지막은 4번째를 찾기위해 순서대로 찾아가야해서 오래걸림
    }
}
