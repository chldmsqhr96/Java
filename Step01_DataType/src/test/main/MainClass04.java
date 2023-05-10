package test.main;
/*
 *  문자형(Char)
 *  65536가지의 코드 값을 가질 수 있다.
 *  전 세계에서 사용하는 모든 문자 1글자를 표현할 수 있다.
 *  single quotation을 사용할 수 있다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		char a = 'a';
		String b = "asd";
		char c = 'b';
		char d = 'c';
		char e = 'd';
		char f = '가';
		char g = '나';
		char h = '/';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a+b+c+d+e);
		
		int code1 = a;
		int code2 = c;
		int code3 = d;
		int code4 = e;
		int code5 = f;
		int code6 = g;
		int code7 = h;
		
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
		System.out.println(code6);
		System.out.println(code7);
	}
}
