package test.main;
import java.util.Random;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("============가위바위보 게임===========");
		System.out.println("가위(0), 바위(1), 보(2) 중에 선택해주세요.");

		int user = sc.nextInt();

		switch(user) {
			case 0: {
				System.out.println("가위(0)를 냈습니다.");
				break;
			}
			case 1: {
				System.out.println("바위(1)를 냈습니다.");
				break;
			}
			case 2: {
				System.out.println("보(2)를 냈습니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다. 게임을 종료합니다.");
				break;
			}	
		}
		
		int com = 0;
		com = r.nextInt(3);

		if (user == 0) {
			switch (com) {
			case 0: {
				System.out.println("컴퓨터는 가위(0)을 냈습니다.");
				System.out.println("비겼습니다.");
				break;
			}
			case 1: {
				System.out.println("컴퓨터는 바위(1)를 냈습니다.");
				System.out.println("졌습니다.");
				break;
			}
			default:
				System.out.println("컴퓨터는 보(2)를 냈습니다.");
				System.out.println("이겼습니다.");
				break;
			}
		}
		
		else if (user == 1) {
			switch (com) {
			case 0: {
				System.out.println("컴퓨터는 가위(0)을 냈습니다.");
				System.out.println("이겼습니다.");
				break;
			}
			case 1: {
				System.out.println("컴퓨터는 바위(1)를 냈습니다.");
				System.out.println("비겼습니다.");
				break;
			}
			default:
				System.out.println("컴퓨터는 보(2)를 냈습니다.");
				System.out.println("졌습니다");
				break;
			}
		}
		
		else if (user == 2) {
			switch (com) {
			case 0: {
				System.out.println("졌습니다.");
				System.out.println("컴퓨터는 가위(0)를 냈습니다.");
				break;
			}
			case 1: {
				System.out.println("컴퓨터는 바위(1)를 냈습니다.");
				System.out.println("이겼습니다.");
				break;
			}
			default:
				System.out.println("컴퓨터는 보(2)를 냈습니다.");
				System.out.println("비겼습니다.");
				break;
			}
		}
	}
}