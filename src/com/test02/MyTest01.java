package com.test02;

class fx {
	public int a;
	public double d;
}

public class MyTest01 {
	public static int a;// MyTest의 멤버변수이면서 전역변수이다.

	public static void main(String[] args) {
		// 1. non-static 주소 생성
		// class명 class변수 = new class
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
