package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		
		try {
			String inputNum = sc.nextLine();
		
			double num = Double.parseDouble(inputNum);
			double result = num + 100;
			System.out.println("입력한 숫자 + 100 : " + result);
		
			System.out.println("마무리");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
	}
}
