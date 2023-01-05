package Squre;

class Solution {
	public int solution(int[] number) {
		int answer = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				for (int a = j + 1; a < number.length; a++) {
					if (number[i] + number[j] + number[a] == 0)
						answer++;
				}
			}
		}
		System.out.println("answer = " + answer);
		return answer;
	}
}

public class Study {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] number = { -2, 3, 0, 2, -5 };
		s.solution(number);
	}
}