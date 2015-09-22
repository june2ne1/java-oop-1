package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점, 최저점 구하기
 */
public class MaxMinMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] avgs = new int[5];
		// ============= 프로그램 시작 ===========
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 5명입니다.");
		System.out.println("평균 점수를 입력하세요.");
		for (int i = 0; i < avgs.length; i++) {
			avgs[i] = scanner.nextInt();
		}
		MaxMin2 maxMin2 = new MaxMin2();
		System.out.println(maxMin2.getMaxMin(avgs));
	} 
}
