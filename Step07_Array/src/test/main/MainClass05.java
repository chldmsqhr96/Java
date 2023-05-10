package test.main;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("main 메소드가 종료 됐습니다.");
	}
}
