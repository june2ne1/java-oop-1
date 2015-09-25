package inheritance;

import java.util.Scanner;

import encapsule.Kaup;
import polymorphism.BankService;

public class HanbitBank {
	public static void main(String[] args) {
		MinusAccount maccount = new MinusAccount();
		BankService service = new BankService();
		Kaup kaup = new Kaup();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력해 주세요");
		int money = scanner.nextInt();
		maccount.deposit(money);
		maccount.loan();
		switch (scanner.nextInt()) {
		case 1:
			String name = "";
			int money2 = 0;
		//	System.out.println(service.deposit(name, money));
			break;

		default:
			break;
		}
		
	}
}
