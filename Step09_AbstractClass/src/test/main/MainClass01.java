package test.main;
import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * [추상 클래스]
		 * 
		 * - class 예약어 앞에 abstarct를 명시해서 클래스를 정의
		 * - 형태만 정의되고 구현되지 않은 메소드가 존재할 수 있음
		 * - 형태만 정의된 메소드를 만들 때 abstarct 예약어를 붙여야함
		 * - 생성자는 존재하지만 단독으로 객체 생성은 불가함(상속 필요)
		 * - 추상클래스 type의 참조값이 필요하다면 추상클래스를 상속받은
		 *   자식클래스를 정의해서 객체를 생성한다.
		 * - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두
		 *   오버라이드(override/재정의)해야만 한다. 
		 */
		
		// Weapon w1 = new Weapon(); // 추상 클래스는 미완성된 클래스이기에 자체적으로 객체를 생성할 수 없다.
		// Weapon w1 = null; // nullPointer 예외 발생
		Weapon w1 = new MyWeapon();
		w1.prepare();
	}
}
