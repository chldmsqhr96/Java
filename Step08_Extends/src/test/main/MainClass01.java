package test.main;
import text.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		/*
		 * HandPhone 클래스의 생성자를 호출해서 객체를 생성했더니
		 * Phone 클래스의 생성자도 호출됐다.
		 * 
		 * 따라서 HandPhone 객체도 생성되고 Phone 객체도 같이 생성 되었다는 걸 유추할 수 있다.
		 * Phone 객체와 HandPhone 객체가 생성되어서 같은 사물함에 들어간다,
		 * 즉, 하나의 참조값으로 PHone의 기능, HandPhone의 기능을 모두 사용할 수 있다.
		 */
	}
}
