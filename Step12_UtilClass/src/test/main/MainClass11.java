package test.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		
		Set<Integer> set = new HashSet<>(nums);
		
		List<Integer> result = new ArrayList<>(set);
		
	}
}
