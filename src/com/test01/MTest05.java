package com.test01;

public class MTest05 {
	public static void fx(int su) {

		System.out.println(su+"을(를) 2진으로 변경 : " + Integer.toBinaryString(su));
		System.out.println(su+"을(를) 8진으로 변경 : " + Integer.toOctalString(su));
		System.out.println(su+"을(를) 16진으로 변경 : " + Integer.toHexString(su));
	}

	public static void main(String[] args) {
		fx(100);
		System.out.println();
		fx(20);

	}

}
