package test.main;

import text.mypac.HandPhone;
import text.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		Object p3 = new HandPhone();
		Phone p2 = (Phone)p3;
		HandPhone p1 = (HandPhone)p3;
	}
}