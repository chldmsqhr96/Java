package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		Calc add1 = new Calc() {
			@Override
			public double exec(double num1, double num2) {
				return num1 + num2;
			}
		}
		*/
		
		Calc add = (num1, num2)-> num1 + num2;
		Calc sub = (num1, num2)-> num1 - num2;
		Calc mul = (num1, num2)-> num1 / num2;
		
		double result1 = add.exec(10, 5);
		double result2 = sub.exec(20, 10);
		double result3 = mul.exec(30, 15);
	}
}
