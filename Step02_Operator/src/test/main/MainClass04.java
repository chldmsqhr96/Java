package test.main;
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. or연산자(또는)
		 * 둘 중에 하나라도 true면 true
		 * 모두다 false일때만 false인 논리 연산자
		 */
		boolean result1 = false || false;
		boolean result2 = false || true;
		boolean result3 = true || false;
		boolean result4 = true || true;
		/*
		 * 2. and연산자(그리고)
		 * 둘다 true일때만 true, 하나라도 false면 결과는 false
		 */
		boolean result5 = false && false;
		boolean result6 = false && true;
		boolean result7 = true && false;
		boolean result8 = true && true;
		/*
		 * 3. not연산자
		 * boolean 값을 반전시킨다.
		 */
		boolean result9 = !false;
		boolean result10 = !true;
	}
}