package com.study;
//static, class : ����� ���ÿ� �ּҰ� �����ȴ�.	

public class study04 {
	//���� ���� 
	public static void Prn_All(String a, String b) {
		System.out.println(a+"���� "+b+"���� �����ϰ� �ֽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		String name = "�豹��";
		String addr = "����� ���ʱ� ���ھ�";
		
		Prn_All(name,addr); //1. MTest04�� �����. 2. static void Prn_All(Strgin, String)		
	}
}
