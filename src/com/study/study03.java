package com.study;
import java.util.Date; //����

public class study03 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date today = new Date();  //������ ����   ���� = ���԰� () ; 
		today.setMonth(11);
		System.out.println(today.getMonth()+1);
	}
}
