package Squre;

class Solution {
	public int solution(int n) {
		int answer = 1;
		/**
		 * 피자는 7조각
		 * 피자를 나눠먹을 사람의 수 n
		 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자수 구하기
		 */
		int pizza = 7;
		int mok = n / pizza;
		int na = n % pizza;
		answer = mok;
		if (na != 0) {
			answer++;
		}

		System.out.println("answer : " + answer);
		return answer;
	}
}

public class Study {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(22);
	}
}