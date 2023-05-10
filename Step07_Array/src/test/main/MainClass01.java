package test.main;
/*
 * 자바에서 배열도 객체이다.
 * 배열은 참조 데이터 type이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = null; // int 옆에 []를 붙이면 int배열 타입이 된다. 배열이되면서 참조 데이터 타입이 된다.
		int[] nums2 = {10,20,30,40,50};
		double[] num3 = {10.1, 10.2, 10.3, 10.4, 10.5};
		boolean[] truth = {true,false,true,false,true};
		String[] names = {"김구라","해골","원숭이","주뎅이","덩어리"};
		
		//배열 객체는 clone()이라는 메소드와 length라는 필드가 있다.
		//복제본(clone) 만들기
		int[] result = nums2.clone();
		//배열의 길이(length) 얻어내기
		int size = nums2.length;
		
		//배열은 순서가 있는 데이터이다. 특정 index의 item 참조하는 방법
		int first = nums2[0];
		int second = nums2[1];
		int third = nums2[2];
	}
}