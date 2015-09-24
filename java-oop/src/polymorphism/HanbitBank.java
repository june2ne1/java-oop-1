package polymorphism;

import java.util.Scanner;

import encapsule.Kaup;

public class HanbitBank {
	public static void main(String[] args) {
		BankService service = new BankService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력해 주세요");
		String name = "";
		int money = 0;
		while (true) {
			System.out.println("동작선택 : 1.계좌개설 2.입금 3.출금 4.조회 5.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1: service.open(); break;
			case 2: 
				
				System.out.println(service.deposit(name, money)); 
				break;
			case 3: service.withdraw();  break;
			case 4: service.search(); break;
			case 5:  return;
			default:break;
			}
		}
	}
}
