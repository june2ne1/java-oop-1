package encapsule;
/**
 * @file_name : Kaup.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 인스턴스 변수
 */
public class Kaup {
	private String name; // 
	private double height;
	private double weight;
	private String result;
	// ALT + SHIFT + S
	// 비만 측정
	public void setResult() {
		int idx = (int) ((weight/(height*height))*10000);
		if (idx >= 30) {
			this.result = "비만";
		}
		else if (idx >= 24) {
			this.result ="과체중";
		}
		else if (idx >= 20) {
			this.result = "정상";
		}
		else if (idx >= 15) {
			this.result = "저체중";
		}
		else if (idx >= 13) {
			this.result = "마름";
		}
		else if (idx >= 10) {
			this.result = "영양실조";
		}
		else {
			this.result = "소모증";
		}
	}
	public String getResult() {
		return result;
	}



	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	@Override
	public String toString() {
		return "안녕하세요."+this.name+"님께서는 "+this.result+" 입니다";
	}

}
/**
 *  get : read , set : write 
 */
