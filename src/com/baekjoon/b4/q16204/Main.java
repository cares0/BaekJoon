package com.baekjoon.b4.q16204;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			int abs = Math.abs(m-k);
			
			System.out.println(n-abs);
			
		

	}

}
