package test.mypac;

public abstract class Weapon { // 추상 메소드를 포함하고 있는 클래스는 추상 클래스로 선언되어야 한다.
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	public abstract void attack(); //모양만 정의되고 구현되지 않은 메소드 즉 미완성된 메소드는
								   //추상화(abstract)를 해주어야 한다.
								   //추상 클래스는 생성자는 존재하지만 추상 클래스를 통해 객체를 생성할 수 없다.
}