package com.test02;

class Test {
	public int a, b;

	public Test() { // default 생성자 첫번째 방
		a = 100;
		b = 50;
		System.out.println("나 기본생성자야");
	}

	public Test(int a) { // overload 생성자 두번째 방 (값을 미리 받은 방)
		this.a = a;// this : 현재 오브젝트를 지칭하는 연산자.
		System.out.println("나 overload생성자야");
	}
}

public class MyTest04 {
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);

		Test t2 = new Test(500);
		System.out.println(t2.a);
	}
}
