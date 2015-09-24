package polymorphism;

public interface Bank {
	// 1.개설
	public String open();
	// 2.입금
	public String deposit(String name,int money); // 추상메소드
	// 3.출금
	public String withdraw();
	// 4.조회
	public String search();
	
}
