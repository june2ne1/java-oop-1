package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java 
 * @author    : 강인석
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor {
	public int[] getFactor(int dest) {
		int count = 0;
		for (int i = 1; i < dest+1; i++) {
			if(dest%i==0) {
				count++;
			}
		}
		int[] temp = new int[count]; 
		count=0;
		for (int i = 1; i < dest+1; i++) {
			if(dest%i==0) {
				temp[count]=i;
				count++;
			}
		}
		return temp;
	}
}
/**
 * 19 : 만약 dest 가 6이면 count 는 4 일것이고,
 * 20 : count 가 가진 4라는 값은 19번라인에서 임무를 수행 한 후 사라져야 함
 * 		그런데 20번 라인에서 int 변수가 필요해져서 재사용함
 * 23 : 최초 count 는 0부터 시작하여
 * 24 : 약수의 갯수만큼만 생성될 것임
 */




