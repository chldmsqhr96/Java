package test.main;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나눌 수 입력");
		String inputNum=scan.nextLine();
		System.out.println("나누어 지는 수 입력");
		String inputNum2=scan.nextLine();
		
		try {
		int num1 = Integer.parseInt(inputNum);
		int num2 = Integer.parseInt(inputNum2);
		
		int result = num2/num1;
		int result2 = num2%num1;
		
		System.out.println(num2 + " 를 " + num1 + "으로 나눈 몫 : " +  result);
		System.out.println(num2 + " 를 " + num1 + "로 나눈 나머지 : " + result2);
		}
		
		catch(NumberFormatException e){
			System.out.println("숫자를 입력하세요");
		}
		
		catch(ArithmeticException e) {
			System.out.println("수를 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("중요한 작업");
		}
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
