package com.baekjoon.b5.q1550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 답안
		// 16진수(String) > 10진수(int)
		int num1 = Integer.parseInt(sc.next(), 16);
		System.out.println(num1);
		
		
		// 10진수(int) > 16진수(String)
		String num2 = Integer.toHexString(sc.nextInt());
		System.out.println(num2);
	
	}

}
