package com.baekjoon.b5.q2475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		double pow1 = Math.pow(num1, 2);
		double pow2 = Math.pow(num2, 2);
		double pow3 = Math.pow(num3, 2);
		double pow4 = Math.pow(num4, 2);
		double pow5 = Math.pow(num5, 2);
		
		System.out.println((int) (pow1 + pow2 + pow3 + pow4 + pow5) % 10);
		
		
		// 이게 더 간결한 코드
		int result = 0;
		
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			result += Math.pow(a, 2);
		}
		System.out.println(result%10);
		
		
	}

}
