package com.test02;

public class MyTest03 {
	public static void main(String[] args) {
		fx u1=new fx();
		fx u2=new fx();
		System.out.println(u1);
		System.out.println(u2);
		u1.a=2000;
		u1.d=9.7;
		
		System.out.println(u1.a+" , "+u1.d);
		
		u2.a=3000;
		u2.d=10.6;
		System.out.println(u2.a+" , "+u2.d);
	}
}
