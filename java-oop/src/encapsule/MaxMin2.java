package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점, 최저점 구하기
 */
public class MaxMin2 {
	public String getMaxMin(int[] avgs) {
		
		int max=0, min=100;
		String result = "";
		for (int i = 0; i < avgs.length; i++) {
			
			if (avgs[i] > max) {
				max = avgs[i];
			}
			if (avgs[i] < min) {
				min = avgs[i];
			}
		}
		return result ="최고점 : "+max +"최저점 : "+min;
	} 
}
