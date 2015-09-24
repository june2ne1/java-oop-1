package encapsule;

public class Card {
	// 멤버필드
	private String kind; // 카드의 무늬 (스페이드, 다이아, 하트, 클럽)
	private int number; // 카드의 넘버 (1 ~ 13)
	private String name;
	

	static int WIDTH = 100; //  카드의 너비 
	static int HEIGHT = 180; // 카드의 높이
	
	public Card() {
		this.number = (int) ((Math.random()*13)+1);
		this.kind = "하트";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	public void setKind() {
		this.kind = "하트";
	}
	public void setNumber() {
		this.number = (int) ((Math.random()*13)+1);
	}
	
	// 멤버메소드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
