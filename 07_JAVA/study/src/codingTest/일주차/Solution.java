package codingTest.일주차;

import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        // 정렬 0(nlogn)
        Arrays.sort(participant);
        Arrays.sort(completion);
        //i 0 ~ n-1 순회  - 0(n)
        for(int i = 0; i < participant.length; i++){
            if(participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
