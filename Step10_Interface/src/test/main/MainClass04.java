package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("벽에 구멍을 뚫어요");
			}
		}
		);
		
		useDrill(()->{ // 추상메소드가 오직 1개인 인터페이스에 한해서 자바에서도 Arrow Function같은
					   // 형태로 메소드를 간략하게 줄일 수 있다.
			System.out.println("천장에 구멍을 뚫어요");
		});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
