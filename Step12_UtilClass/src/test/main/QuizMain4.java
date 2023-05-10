package test.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuizMain4 {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("로또를 몇개 구입하시겠어요 : ");
	     int amount = sc.nextInt();
	     
	     for(int i=0; i < amount; i++) {
	         printLotto();
	         System.out.println("");
	     }
	}

	public static void printLotto() {
		//랜덤 생성
		Random ran = new Random();
		
		//set생성
		Set<Integer> lottoSet = new HashSet<>();
		
		while(true) { // while문 조건을 통해 1~45 숫자를 랜덤으로 입력
			int ranNum = ran.nextInt(45)+1;
			lottoSet.add(ranNum); // 이를 set에 추가
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		List<Integer> lottoNums = new ArrayList<>(lottoSet);
		
		Collections.sort(lottoNums);
		// Collections.sort(lottoNums, Collections.reverseOrder()); 내림차순 정렬
		
		for(int i = 0; i < lottoNums.size(); i++) {
			int num = lottoNums.get(i);
			System.out.print(String.format("%02d", num));
			if(i == lottoNums.size()-1) {
			} else {
				System.out.print(", ");
			}
		}
	}
}
