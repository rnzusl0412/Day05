package com.test01;

//API �����ϴ� return�� static �޼ҵ带 ����� ����.
public class MTest04 {
	
	public static void main(String[] args) {
		//1. Integer class �� ����� ����.
		int su=11; //int + Method() = Integer = java.lang  Ŭ���� ��ġ
		
		//public static String toBinaryString(int a) { return "";}
		String str=Integer.toBinaryString(su);
		String str2=Integer.toOctalString(su);
		String str3=Integer.toHexString(su);
		
		
		System.out.println("su�� 2������ ���� : "+ str);
		System.out.println("su�� 8������ ���� : "+ str2);
		System.out.println("su�� 16������ ���� : "+ str3);

	}

	

}
