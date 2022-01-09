package com.baekjoon.b5.q14645;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			k += sc.nextInt();
			k -= sc.nextInt();
		}
		System.out.println("비와이");

	}

}
