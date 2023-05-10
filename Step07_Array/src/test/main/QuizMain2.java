package test.main;
import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		String[] a = {"Cherry", "apple", "banana", "melon", "7"};
		Random ran = new Random();
		
		for (int i=0; i<3; i++) {
			int b = ran.nextInt(5);
			System.out.print(a[b]);
			if(i<2) {
				System.out.print(" | ");
			}
		}
	}
}