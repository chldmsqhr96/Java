package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> msgs = new ArrayList<>();
		
		for(int i = 0; msgs.size() < 5; i++) {
			System.out.print("메세지를 입력하세요 : ");
			String msg = sc.nextLine();
			msgs.add(msg);
		}
		
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
}