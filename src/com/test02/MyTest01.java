package com.test02;

class fx {
	public int a;
	public double d;
}

public class MyTest01 {
	public static int a;// MyTest�� ��������̸鼭 ���������̴�.

	public static void main(String[] args) {
		// 1. non-static �ּ� ����
		// class�� class���� = new class
		fx um = new fx();
		System.out.println(um);
		um.a = 100;
		um.d = 20.9;
		
		System.out.println(um.a +" , "+um.d);
		System.out.println();
				
//		um=null;
//		System.out.println("um = "+um);
//		System.out.println(um.a +" , "+um.d);
	}

}
