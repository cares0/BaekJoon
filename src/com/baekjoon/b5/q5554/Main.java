package com.baekjoon.b5.q5554;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		for(int i=0;i<4;i++) {
			int time = sc.nextInt();
			total += time;
		}

		System.out.println(total / 60);
		System.out.println(total % 60);
	}

}
