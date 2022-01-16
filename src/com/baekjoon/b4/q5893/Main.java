package com.baekjoon.b4.q5893;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int a = Integer.parseInt(input, 2);
		a *= 17;
		String result = Integer.toBinaryString(a);
		
		System.out.println(a);
		System.out.println(result);
	}

}
