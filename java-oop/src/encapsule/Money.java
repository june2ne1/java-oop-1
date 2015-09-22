package encapsule;

import java.util.Scanner;

/**
 * @file_name : Money.java 
 * @author    : 박 준 규
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money {
	/**
	 * 예를 들어서 134,530 이면
	 * 거스름돈을 화폐로 표시해주면 5만원: 2, 1만원: 3,...
	 * 표시하고 10원미만은 절삭
	 */
	public String[] countMoney(int money) {
		int[] moneyUnit = {50000,10000,5000,1000,500,100,50,10};
		int[] moneyCount = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		for (int i = 0; i < moneyUnit.length; i++) {
			moneyCount[i] = money / moneyUnit[i]; 
			money = money % moneyUnit[i];
			results[i]=moneyUnit[i]+"원 : " + moneyCount[i];
		}
		return results;
	}
}
/**
 *  22 : moneyUnit과 같은 index의 moneyCount에는 화폐의 수를 저장한다.
 *  25 : moneyUnit[0] = 5만원권, 전체금액을 5만원권으로 나눈 몫을 구한다
 */






