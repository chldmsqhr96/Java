package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		
		if(ranNum==4) {
			throw new WowException("ㄷㄷ");
		}
		System.out.println("메소드 종료");
	}
}
