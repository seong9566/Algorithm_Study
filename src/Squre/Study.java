package Squre;

class Solution {
	public int solution(int n, int t) {
		// 풀이 1
		int answer = n * (int) Math.pow(2, t);
		// 풀이 2
		int answer2 = n;
		for (int i = 0; i < t; i++) {
			answer2 = answer2 + answer2;
		}
		System.out.println(n + " 마리 " + t + " 시간 " + "결과 : " + answer);
		return answer;
	}

}

public class Study {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(2, 10);
		s.solution(7, 15);
	}
}