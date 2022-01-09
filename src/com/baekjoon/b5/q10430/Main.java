package com.baekjoon.b5.q10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int [] arr = new int[4];
		arr[0] = (a+b)%c;
		arr[1] = ((a%c) + (b%c))%c;
		arr[2] = (a*b)%c;
		arr[3] = ((a%c) * (b%c))%c;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
