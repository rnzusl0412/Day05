package com.test01;

//import com.test02.MyTest01;

public class MTest06 {
	/*
	 * public static void fx(double x) { System.out.println(x+ " �� exp�� �ٲٸ� ="+
	 * Integer.(x)); }
	 */

	public static void main(String[] args) {
		// 2. Math class �޼ҵ� Ȱ��
		// public static double sqrt(double a)
		int su = 40;
		double d = Math.sqrt(su);
		System.out.printf("su=%d  => sqrt = %3.1f \n", su, d);

		// ex) "100"�� ���ڷ� ��ȯ�� ���� +200�� �ؼ� �����ϰ� �ʹ�.
		String str = "500";
		int r = Integer.parseInt(str);
		// r=r+200; //r=100+200
		r += 200; // r=r-50; r -= 50;
		System.out.println(r);

		// int�� ���ڿ��� ��ȯ�ϴ� �޼ҵ�

		String f = Integer.toString(r);
		System.out.println(f + 1000);

//		System.out.println(MyTest01.a);

	}
}
