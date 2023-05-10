package test.auto;

public class Bus extends Car{
	//부모 생성자에서 필요한 값을 자식 생성자에서 받아서 전달해주는 코드가 있어야 문법이 성립된다.
	public Bus(Engine engine) {
		//super()는 부모 생성자를 가리키는 표현식이다.
		//super()는 항상 문법의 최상단에 있어야 한다.
		super(engine);
	}
	public void powerDrive() {
		if(this.engine==null) {
			System.out.println("engine이 없어서 달릴 수 없어요");
			return;
		}
		System.out.println("승객을 태우고 달려요");
	}
}