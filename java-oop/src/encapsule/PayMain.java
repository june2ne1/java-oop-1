package encapsule;

import java.util.Scanner;

/**
 * @file_name : TaxTest.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 세금 출력 프로그램
 */
public class PayMain {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현 정권은 세율이 9.7프로라고 합니다.
	 */
	
	public static void main(String[] args) {
		// 지역변수 초기화 : 변수값의  그 타입에 맞는  기본값을 할당하는 것
		// 단  스캐너로 입력 받을 시 생략가능
		Pay ironman = new Pay(3600,"아이언맨");
		Pay hulk = new Pay(2400,"헐크");
		Pay thor = new Pay(1200,"토르");
		
		System.out.println("======== 9월 급여내역=======");
		System.out.println("name\tsalary\ttax\tmoney");
		System.out.println(ironman.toString());
		System.out.println(hulk.toString());
		System.out.println(thor.toString());
	}
}








