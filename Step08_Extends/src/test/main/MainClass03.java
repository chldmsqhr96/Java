package test.main;
import text.mypac.HandPhone;
import text.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		// p1 안에 있는 참조값을 p2라는 Phone Type 변수에 대입하기
		Phone p2 = p1;
		// p1 안에 있는 참조값을 p3라는 Object Type 변수에 대입하기
		Object p3 = p1;
		// 자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다
	}
}