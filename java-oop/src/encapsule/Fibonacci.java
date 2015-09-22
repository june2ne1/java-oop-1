package encapsule;

public class Fibonacci {
	public int[] fiboCalc(int[] num){
		int[] answer = new int[20]; //출력할 피보나치 수열 길이
		//초기값 두개는 미리 저장
		answer[0] = num[0]; 
		answer[1] = num[1];
		for (int i = 2; i < answer.length; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
}
