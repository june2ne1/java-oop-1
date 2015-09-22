package encapsule;

import java.util.Scanner;
/**
 * @file_name : FibonacciMain.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 피보나치 수열
 */
public class FibonacciMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();
		int[] num = new int[2];
		int[] answer = new int [20];
		System.out.println("피보나치 수열을 만들 초기값을 두개 입력해주세요.");
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력 : ");
			num[i] = scanner.nextInt();
		}
		answer = fibonacci.fiboCalc(num);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
