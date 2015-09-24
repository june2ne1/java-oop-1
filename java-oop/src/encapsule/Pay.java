package encapsule;

public class Pay {
	// 멤버 필드
	final int TAX_RATE = (int) 0.098; // 상수
	private int salary; // 인스턴스 (의) 변수
	private String name;
	private int tax;
	// 멤버 메소드
	
	public Pay(int salary, String name){
		this.name = name;
		this.salary = salary;
		this.tax = (int) (salary * 0.097);
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getTax() {
		return tax;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTax(int salary) {
		this.tax = (int) (salary * 0.097);
	}
	
	@Override
	public String toString() {
		return this.name+"\t"+this.salary
				+"\t"+this.tax+"\t"+(this.salary-this.tax);
	}
}










