package com.test01;

public class MTest05 {
	public static void fx(int su) {

		System.out.println(su+"��(��) 2������ ���� : " + Integer.toBinaryString(su));
		System.out.println(su+"��(��) 8������ ���� : " + Integer.toOctalString(su));
		System.out.println(su+"��(��) 16������ ���� : " + Integer.toHexString(su));
	}

	public static void main(String[] args) {
		fx(100);
		System.out.println();
		fx(20);

	}

}
