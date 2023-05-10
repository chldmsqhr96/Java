package test.mypac;

//계산기 인터페이스
@FunctionalInterface // 추상 메소드를 하나 만들도록 강제
public interface Calc {
	//메소드의 두개의 실수를 전달 받아서 어떤 연산을 하고 결과 값을 리턴해주는 메소드
	//어떤 연사을 할지는 개발자가 알아서 정하기
	public double exec(double num1, double num2);
}