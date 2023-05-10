package test.main;
import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//box라는 이름의 지역 변수에 FruitBox 객체 참조
		FruitBox<Apple> box = new FruitBox<Apple>();
		//box에 담긴 참조값을 이용해서 pack() 메소드를 호출
		box.pack(new Apple());
		//box에 담긴 참조값을 이용해 unPack()호출 후 참조값을 fruit라는 지역 변수에 담기
		Apple fruit = box.unpack();
		
		FruitBox<Melon> box2 = new FruitBox<Melon>();
		box2.pack(new Melon());
		box2.unpack();
		
		FruitBox<Orange> box3 = new FruitBox<>(); // 우측 <>안 내용은 생략 가능함
		box3.pack(new Orange());
		box3.unpack();
	}
}