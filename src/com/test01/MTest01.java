package com.test01;

public class MTest01 {

	public static int getRes() {
		return 'B';
	}

	public static float getF() {
		return 98.7f;
	}

	public static void main(String[] args) {

		int res = getRes(); // ���� 100�� �����ϴ� getRes()�޼ҵ� return 100;
		System.out.println(res); // 100

		float f = getF(); // return 98.7f;
		System.out.println(f); // 98.7f
		
		System.out.println(getRes()); 
		//System.out.println(98); system.out.println(int);
		
		System.out.println(getF());
		
		System.out.println(getRes()+" : "+getF());
	}
}
