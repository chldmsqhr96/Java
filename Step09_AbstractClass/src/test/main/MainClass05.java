package test.main;
import test.mypac.Weapon;

public class MainClass05 {
	
	static class SeaWeapon extends Weapon { // 본래 class 앞에 static을 붙이는건 안되지만
											// innerClass 한에서는 가능하다.
		@Override
		public void attack() {
			System.out.println("바다를 공격해요");
		}
	}
	
	public static void main(String[] args) {
		Weapon w1 = new SeaWeapon();
		w1.prepare();
		w1.attack();
		
		//우주를 공격하는 무기를 만들어서 이용하고 싶다
		
		class SpaceWeapon extends Weapon {
			@Override
			public void attack() {
				System.out.println("우주를 공격해요");
			}
		}
		
		Weapon w2 = new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}
}
