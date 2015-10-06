package person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @file_name : PersonMain.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 10. 6.
 * @story     : String 클래스 예제
 */
public class PersonMain {
	public static void main(String[] args) {
		/**
		 * Person 클래스에 String 타입의 인자값을
		 * 받는 생성자가 없어서 에러가 났습니다.
		 */
		/**
		 * 클래스는 주소값이 없고, 객체는 주소값을 갖는다
		 * 주소값은 
		 * A : 65 => 101010101010
		 * B : 66
		 * ㄱ : 010101111111000000000
		 * .  
		 */
		
	
		String s1 = new String("800101-1234567");  // 비추
		String s2 = new String("800101-1234567");  // 비추 -> 메모리 낭비
		s2 = s1;
		String s3 = "800101-1234567";  // 새로 주소값 지정합니다.
		
		String s4 = "800101-1234567";  // s4 는 s3 에 지정된 주소값을 그냥 할당받아요.
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		
		Test t = new Test("800101-1234567");
		if (p1.getSsn()==t.getSsn()) {
			System.out.println("정말 상수풀 주소를 참조하는 것이 맞구나");
		}else{
			System.out.println("모든 것은 구라였다.");
		}
		if (p1.equals(p2)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		if (p1.equals(t)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		
		// equals() : 밸류 비교
		// == : 레퍼런스 비교
		
		/**
		 * p1과 p2가 동일인물인지 체크하는 로직을 완성하시오
		 * 삼항연산자로 처리 바랍니다.
		 * 현재 2015년입니다. 
		 * 현재 p1 의 나이는 몇살입니까 ?
		 * 결과물은 
		 * [ p1 과 p2 는 동일인물이며, 나이는 **살입니다 ]
		 */
		int ageYear = 0, age = 0;
		switch (p1.getSsn().charAt(7)) {
		case '1': case '2':
			ageYear = 1900;
			break;
		case '3': case '4':
			ageYear = 2000;
			break;
		default:
			break;
		}
		age = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))
				-(Integer.parseInt(p1.getSsn().substring(0, 2))+ageYear)+1;
		System.out.println((p1.getSsn().equals(p2.getSsn()))?"p1 과 p2 는 동일인물이며, 나이는 "
		+age+"살입니다":"동일인물이 아닙니다.");
		// equals() : 밸류값
		// == : 주소값

		/*System.out.println((p1.getSsn().equals(p2.getSsn()))?"동일":"아님");
		System.out.println((p1.getSsn()==p2.getSsn())?"동일":"아님");
		
		System.out.println((s1==s2)?"동일":"아님");
		System.out.println((s1.equals(s2))?"동일":"아님");*/
		
	}
}
class Person{
	private String ssn; // 주민번호
	private String age; // 나이
	private String name;
	public Person(String ssn) { // 태어나자 마자 주민번호를 부여받는다
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public String getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return true;
		}else{
			return false;
		}
	}
}
class Test{
	private String ssn;
	public Test(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}