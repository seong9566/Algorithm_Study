package babbling;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        int length = babbling.length;
        System.out.println("입력 받은 문자열 길이 : " + length);
        for (int i = 0; i < length; i++) {
            String tempBabbling = babbling[i];
            // aya,ye,woo,ma 문자만 자름, 넷중 하나가 나오면 빈칸이 된다.
            String[] temp = tempBabbling.split("aya|ye|woo|ma");
            if (temp.length == 0) {
                answer++;
            }
        }
        return answer;
    }
}

public class babbling {
    public static void main(String[] args) {
        String[] firstList = { "aya", "yee", "u", "maa", "wyeoo" };
        String[] secondList = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
        Solution s = new Solution();
        int firstResult = s.solution(firstList);
        int secondResult = s.solution(secondList);
        System.out.println("첫번째 배열 result : " + firstResult);
        System.out.println("두번째 배열 result : " + secondResult);

    }
}
