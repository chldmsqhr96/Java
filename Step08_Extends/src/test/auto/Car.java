package test.auto;
/* - 접근 지정자의 범위
 * 
 * public : 어디서든 접근 가능
 * protected : 동일한 패키지 혹은 상속관계에서 자식에서 접근 가능
 * default : 동일한 package안에서만 접근 가능(생략시 default)
 * private : 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 * 
 * 접근 지정자가 붙는 위치
 * 1. 클래스 선언
 * 2. 생성자
 * 3. 필드
 * 4. 메소드
 * 
 * 클래스는 default와 public 두 가지 접근 지정자만 지정 가능하다.
 * 접근 지정자를 생략한 것이 default 접근 지정자이다.
 */
public class Car {
	protected Engine engine;
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(this.engine==null) {
			System.out.println("engine 객체가 없어서 달릴 수 없어요");
			return;
		}
		System.out.println("달려요");
	}
}
