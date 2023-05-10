package test.main;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 useRemocon() 메소드를 호출하기 위해서는 Remocon 인터페이스 type의 참조값이 필요하다.
		//익명의 Local Inner Class를 이용하여 Remocon type의 참조값을 만들어내서 호출해보자
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요");
			}

			@Override
			public void down() {
				System.out.println("내려요");
			}
		});
		
		
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요2");
			}

			@Override
			public void down() {
				System.out.println("내려요2");
			}
		};
		r1.up();
		r1.down();
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}