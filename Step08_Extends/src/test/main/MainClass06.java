package test.main;

import text.mypac.AndroidPhone;
import text.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		AndroidPhone p2 = (AndroidPhone)p1; // ClassCast 예외 발생
	}
}
