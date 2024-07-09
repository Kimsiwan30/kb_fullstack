package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        // 길이가 10인 배열을 생성
        // 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가집니다
        // Set 을 이용해서 발생한 배열에 중복 값이 있으면 "중복이다!"
        //중복이 없을 경우에는 "증복이 아니다!"

        Random rand = new Random();
        int [] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10) +1;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < intArr.length; i++) {
            boolean isNotDuplicated = set.add(intArr[i]);
            if (isNotDuplicated) {
                System.out.println("중복이 아니다");
            }else{
                System.out.println("중복이다");
            }
        }

    }
}
