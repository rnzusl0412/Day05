package com.test02;

class Test {
	public int a, b;

	public Test() { // default ������ ù��° ��
		a = 100;
		b = 50;
		System.out.println("�� �⺻�����ھ�");
	}

	public Test(int a) { // overload ������ �ι�° �� (���� �̸� ���� ��)
		this.a = a;// this : ���� ������Ʈ�� ��Ī�ϴ� ������.
		System.out.println("�� overload�����ھ�");
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
