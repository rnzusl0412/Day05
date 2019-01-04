package com.study;
import java.util.Date; //참조

public class study03 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date today = new Date();  //변수의 종류   변수 = 대입값 () ; 
		today.setMonth(11);
		System.out.println(today.getMonth()+1);
	}
}
