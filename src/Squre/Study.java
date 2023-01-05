package Squre;

import java.util.ArrayList;

class Solution {
	public ArrayList<Integer> solution(int n) {

		/*
		 * 정수 n이 매개변수로 주어질 때,
		 * n 이하의 홀수가 오름차순으로
		 * 담긴 배열을 return하도록 solution 함수를 완성해주세요.
		 */

		ArrayList<Integer> answer = new ArrayList<>();

		// 숫자를 담음
		for (int i = 1; i <= 100; i++) {
			if (i <= n) {
				if (i % 2 == 1) {
					answer.add(i);
				}
			}
		}

		return answer;
	}
}

public class Study {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(15);
	}
}