package com.test01;

//import com.test02.MyTest01;

public class MTest06 {
	/*
	 * public static void fx(double x) { System.out.println(x+ " 를 exp로 바꾸면 ="+
	 * Integer.(x)); }
	 */

	public static void main(String[] args) {
		// 2. Math class 메소드 활용
		// public static double sqrt(double a)
		int su = 40;
		double d = Math.sqrt(su);
		System.out.printf("su=%d  => sqrt = %3.1f \n", su, d);

		// ex) "100"을 숫자로 변환한 다음 +200을 해서 전송하고 싶다.
		String str = "500";
		int r = Integer.parseInt(str);
		// r=r+200; //r=100+200
		r += 200; // r=r-50; r -= 50;
		System.out.println(r);

		// int를 문자열로 변환하는 메소드

		String f = Integer.toString(r);
		System.out.println(f + 1000);

//		System.out.println(MyTest01.a);

	}
}
