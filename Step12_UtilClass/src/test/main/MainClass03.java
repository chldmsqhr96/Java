package test.main;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> greet = new ArrayList<>();
		greet.add("Hello");
		greet.add("hi");
		greet.add("good night");
		
		Consumer<String> con = new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println("오잉");
			}
		};
		
		greet.forEach(con);
		
		greet.forEach(new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println("오잉2");
			}
		});
		
		greet.forEach((t)->{
			System.out.println("오잉3");
		});
	}
}