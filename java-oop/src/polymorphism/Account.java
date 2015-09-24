package polymorphism;

/**
 * @file_name : Account.java
 * @author : coolbeat@naver.com
 * @date : 2015. 9. 23.
 * @story : 통장 개설 프로그램
 */
public class Account {
    protected int accountNo; // 계좌번호
    protected String ownerName; // 계좌주인
    private String password; // 통장비번
    protected int restMoney; // 잔액
    protected static final String BANK_NAME = "한빛뱅크";
	
	
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듦과 동시에
	 * 은행 이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 6자리로 합시다)
	 * 계좌주인의 이름은 새겨지며
	 * 비번도 설정합니다.
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	public void deposit() {
		
	}
	public void withdraw(){
		
	}
	
	 @Override
	    public String toString() {
	        return "입출금 계좌\n"
	                + "[ "+BANK_NAME+ "]\n"
	                + "계좌번호 :" + "???"+"\n"
	                + "계좌명 :" + "???"+"\n"
	                + "비번 : ********* \n"
	                + "잔액 :"+"???"+"\n"
	                + "으로 통장이 개설되었습니다.";
	    }
}
