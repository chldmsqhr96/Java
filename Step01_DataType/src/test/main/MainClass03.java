package test.main;
/*
 *  Boolean Type
 * 
 *  true, false 두 가지 값 중에 하나.
 * 	true, false를 직접 표현하거나, 혹은 논리 연산의 결과로 얻어낼 수 있다.
 * 	참과 거짓을 표현하는 데이터 type
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun = true;
		
		if (isRun) {
			System.out.println("달려요");
		}
		
		boolean isGreater = 10 > 1; // 10은 1보다 크기에 true
		boolean result = true || false; // or 연산자
		result = false; // 동일한 type인 경우 다른 값을 대입할 수 있다(단, 재선언은 안된다).
		
		System.out.println(isGreater);
		System.out.println(result);
	}
}