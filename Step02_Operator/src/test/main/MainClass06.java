package test.main;
/*
 * 3항 연산자
 */
public class MainClass06 {
	public static void main(String[] args) {
		
		boolean isWait = true;
		String result = isWait ? "기다려요" : "기다리지 않아요";
		System.out.println(result);
		
		String result2 = null;	
		if (isWait) {
			result2 = "기다려요";
		} else {
			result2 = "기다리지 않아요";
		}
		System.out.println(result2);
	}
}
