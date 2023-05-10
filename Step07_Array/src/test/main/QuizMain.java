package test.main;
import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		String[] a = {"Cherry", "apple", "banana", "melon", "7"};
		Random ran = new Random();
		int b = ran.nextInt(5);
		
		System.out.println(a[b]);
	}
}