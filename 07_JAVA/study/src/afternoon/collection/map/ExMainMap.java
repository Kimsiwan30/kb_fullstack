package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMainMap {
    public static void main(String[] args) {
        // 길이가 10인 배열을 생성
        // 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가집니다
        // Map 을 이용해서 특정 값이 몇번 나왔는지를 기록하는 Map 데이터 생성
        Random rand = new Random();
        int [] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10) +1;
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0; i<=intArr.length ; i++){
            map.put(i, 0);
        }
        for(int i = 0; i <intArr.length ; i++){
            int num = intArr[i];
            map.put(num, map.get(num) + 1);
        }

        System.out.println("map: " + map);

    }
}
