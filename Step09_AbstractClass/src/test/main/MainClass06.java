package test.main;
import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
	//아래 있는 useWeapon() 메소드를 사용하고자 한다면 Weapon Type의 참조값이 필요하다.
		// useWeapon(new MyWeapon());
		
		Weapon w1 = new Weapon() { // Weapon을 상속받은 익명의 클래스
			@Override
			public void attack() {
				System.out.println("아무나 공격해요");
			}  
		};
		
		useWeapon(w1);
		
		useWeapon(new Weapon() { // 익명 클래스 사용
			@Override
			public void attack() {
				System.out.println("김구라를 공격해요");
				}
			}
		);
	}
	
	// Weapon Type의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}