package test.main;

import text.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		AndroidPhone p1 = new AndroidPhone();
		// 메소드 호출해보기(부모 클래스 메소드 포함)
		p1.call(); // Phone 객체 기능
		p1.doInternet(); // HandPhone 객체 기능
		p1.mobileCall(); // HandPhone 객체 기능
		p1.takePicture(); // AndroidPhone 객체 기능
		p1.showPlatform(); // AndroidPhone 객체 기능
	}
} 