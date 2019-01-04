package com.test01;

public class MTest02 {
	public static String getName() {
		return "홍길동";
	}

	public static void Prn() {
		System.out.println("abcde");
	}

	public static void main(String[] args) {

		String a = getName();
		System.out.println(a);
		System.out.println(getName());
		System.out.println(); // void 는 대입, return은 호출
		Prn();
	}
}
