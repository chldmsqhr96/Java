package test.main;
import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		String[] a = {"Cherry", "apple", "banana", "melon", "7"};
		int[] b = new int[3];
		Random ran = new Random();
		
		for (int i=0; i<3; i++) {
			int c = ran.nextInt(5);
			System.out.print(a[c]);
			b[i] = c;
			if(i<2) {
				System.out.print(" | ");
			}
		}
		
		System.out.println("");
		
		if(b[0]==b[1] && b[1]==b[2]) { // 논리 연산자로 2개 이상의 조건을 비교할 수 있다.
			System.out.println("당첨입니다.");
		}
		else {
			System.out.println("꽝입니다.");
		}
	}
}