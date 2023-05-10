package test.mypac;

public class Zoo {
	
	public class Monkey { // 내부(Inner) 클래스
		public void say() {
			System.out.println("안녕 난 원숭이야");
		}
	}
	
	public class Tiger {
		public void say() {
			System.out.println("안녕 난 호랑이야");
		}
	}
	
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
