package com.baekjoon.b5.q2845;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int p = sc.nextInt();
		int total = l * p;
		int [] a = new int [5]; 
		
		for (int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0;i<5;i++) {
			System.out.println(a[i] - total);
		}

	}

}
