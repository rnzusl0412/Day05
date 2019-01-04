package com.study;
//static, class : 선언과 동시에 주소가 생성된다.	

public class study04 {
	//공개 정적 
	public static void Prn_All(String a, String b) {
		System.out.println(a+"님은 "+b+"에서 공부하고 있습니다.");
	}
	
	public static void main(String[] args) {
		String name = "김국현";
		String addr = "서울시 서초구 엔코아";
		
		Prn_All(name,addr); //1. MTest04의 멤버다. 2. static void Prn_All(Strgin, String)		
	}
}
