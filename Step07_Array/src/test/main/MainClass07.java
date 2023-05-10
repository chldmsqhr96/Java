package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int ranNum = ran.nextInt(10);
		int ranNum2 = ran.nextInt(11);
		int ranNum3 = ran.nextInt(20);
		
		//0~4
		int ranNum4 = ran.nextInt(5);
		
		//-25~25
		// int ranNum5 = ran.nextInt(-26, 26); ?
		int ranNum5 = ran.nextInt(51)-25;
		
		System.out.println(ranNum5);
	}
}
