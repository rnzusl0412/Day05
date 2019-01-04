package com.test01;

//API 제공하는 return형 static 메소드를 사용해 보자.
public class MTest04 {
	
	public static void main(String[] args) {
		//1. Integer class 를 사용해 보자.
		int su=11; //int + Method() = Integer = java.lang  클래스 잔치
		
		//public static String toBinaryString(int a) { return "";}
		String str=Integer.toBinaryString(su);
		String str2=Integer.toOctalString(su);
		String str3=Integer.toHexString(su);
		
		
		System.out.println("su를 2진으로 변경 : "+ str);
		System.out.println("su를 8진으로 변경 : "+ str2);
		System.out.println("su를 16진으로 변경 : "+ str3);

	}

	

}
