package com.baekjoon.b4.q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 90) {
			System.out.println("A");
		} else if (num >= 80) {
			System.out.println("B");
		} else if (num >= 70 ) {
			System.out.println("C");
		} else if (num >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

	// if else 나 switch case나 메모리, 시간차이는 크게 없는듯
	// if else가 메모리를 조금 더 썼고(정말 미미함) 시간은 조금 더 단축함 (정말 미미함)
}
