package week2.올바른괄호;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "(())()";
        boolean result = s.solution(s1);
        System.out.println(result);
    }
}